package Aula5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetShop{
    Map<String,Pessoa> clientes;

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
    }
    public void listPessoas(){
        for (Map.Entry<String,Pessoa> pessoa : this.clientes.entrySet()){
            System.out.println(pessoa.getValue().toString());
        }
    }
//    public void listCachorros(String cpf){
//        Cachorro[] cachorrosDoCliente = this.clientes.get(cpf).cachorros.toArray(Cachorro[]::new);
//        for (Cachorro cachorro : cachorrosDoCliente){
//            System.out.println(cachorro.toString());
//        }
//    }
    public void listCachorros(String cpf){
        this.clientes.get(cpf).cachorros
        .forEach(cachorro -> System.out.println(cachorro.toString()));
    }

    public void removePessoa(String cpf){
        this.clientes.remove(cpf);
    }

    public void removeCachorro(String cpf,String nomeCachorro){
        List<Cachorro> cachorrosDoCliente = this.clientes.get(cpf).cachorros;
        cachorrosDoCliente.stream().filter(cachorro -> cachorro.nome.equals(nomeCachorro)).forEach(dog -> cachorrosDoCliente.remove(dog));
    }

    public void listVacinados(boolean vacina){
        for (Map.Entry<String,Pessoa> pessoa : clientes.entrySet()){
            pessoa.getValue()
            .cachorros.stream()
            .filter(cachorro ->cachorro.vacinado == vacina)
            .forEach(dog -> System.out.println(dog.toString()));
        }
    }

    public void listVacinados(boolean boolVacina , String cpf){
        clientes.get(cpf).cachorros.stream()
        .filter(cachorro -> cachorro.vacinado == boolVacina)
        .forEach(cachorro ->  System.out.println(cachorro.toString()));
    }

}
