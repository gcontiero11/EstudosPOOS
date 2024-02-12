package Aula6;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PetShop{
    Map<String, Pessoa> clientes;

    public PetShop(){
        this.clientes = new HashMap<>();
    }

    public void addPessoa(String nome,String cpf){
        Pessoa p1 = new Pessoa(nome,cpf);
        this.clientes.put(cpf,p1);
    }

    public void addCachorro(String cpf,String nome,String raca,boolean vacinado){
        Cachorro c1 = new Cachorro(nome, raca, vacinado);
        this.clientes.get(cpf).cachorros.add(c1);
        c1.latir("AAUU");
    }

    public void listPessoas() throws EmptyStructureException{
        if (this.clientes.entrySet().isEmpty()){throw new EmptyStructureException("Não há clientes cadastrados");}
        for (Map.Entry<String, Pessoa> pessoa : this.clientes.entrySet()){
            System.out.println(pessoa.getValue().toString());
        }
    }
    public void listCachorros(String cpf) throws EmptyStructureException{
        List<Cachorro> cachorrosDoCliente = this.clientes.get(cpf).cachorros;
        if (cachorrosDoCliente.isEmpty()) throw (new EmptyStructureException("Este cliente não possui cachorros cadastrados"));
        cachorrosDoCliente.forEach(cachorro -> System.out.println(cachorro.toString()));
    }

    public void removePessoa(String cpf) throws CpfDoesntMetchException,EmptyStructureException{

        if (this.clientes.isEmpty()) {throw (new EmptyStructureException("Não há pessoas cadastradas"));}
        if (this.clientes.get(cpf) == null){throw (new CpfDoesntMetchException("cpf não existente em nosso registro"));}

        this.clientes.remove(cpf);
    }

    public void removeCachorro(String cpf,String nomeCachorro) throws EmptyStructureException{
        if (this.clientes.isEmpty()) {throw (new EmptyStructureException("Não há pessoas cadastradas"));}

        Optional<Pessoa> clienteOpt = Optional.ofNullable(this.clientes.get(cpf));
        clienteOpt.orElseThrow(NullPointerException::new);
        clienteOpt.ifPresent(client -> {
            Optional<List<Cachorro>> cachorrosListOptional = Optional.ofNullable(client.cachorros);
            cachorrosListOptional.orElseThrow(NullPointerException::new);
            cachorrosListOptional
                    .ifPresent(cachorros -> {
                        for (Cachorro cachorro : cachorros){
                            if (cachorro.nome.equals(nomeCachorro)){
                                client.cachorros.remove(cachorro);
                                break;
                            }
                        }

            });
        });
    }

    public void listVacinados(boolean vacina) throws EmptyStructureException{
        if (this.clientes.isEmpty()){throw new EmptyStructureException("Não há pessoas cadastradas");}
        for (Map.Entry<String, Pessoa> pessoa : this.clientes.entrySet()){
            if (pessoa.getValue().cachorros.isEmpty()){throw new EmptyStructureException("Este cliente não possui cachorros cadastrados");}
            pessoa.getValue()
            .cachorros.stream()
            .filter(cachorro ->cachorro.vacinado == vacina)
            .forEach(System.out::println);
        }
    }

    public void listVacinados(boolean vacinaBool , String cpf) throws CpfDoesntMetchException,EmptyStructureException{
        Pessoa cliente = this.clientes.get(cpf);
        List<Cachorro> cachorrosDoCliente = this.clientes.get(cpf).cachorros;
        Optional<Pessoa> clienteOpt = Optional.ofNullable(cliente);
        Optional<List<Cachorro>> cachorrosDoClienteOpt = Optional.ofNullable(cachorrosDoCliente);

        if(clienteOpt.isEmpty()){throw new CpfDoesntMetchException("cpf não existente em nosso registro");}
        if(cachorrosDoClienteOpt.isEmpty()){throw new EmptyStructureException("Este cliente não possui cachorros cadastrados");}

        cachorrosDoCliente
        .stream().filter(cachorro -> cachorro.nome != null)
        .filter(cachorro -> cachorro.vacinado == vacinaBool)
        .forEach(System.out::println);
    }
    public void verificaCpf(String cpf) throws CpfDoesntMetchException{
        if(this.clientes.get(cpf) == null) {throw new CpfDoesntMetchException("Cpf não cadastrado");}
    }
}
