package Aula6;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        PetShop myPetshop = new PetShop();
        int escolha = -1;
        String cpf;
        String nomeCachorro;
        while (escolha != 0){
            try {
                escolha = menu();
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido! Digite um numero dentre as opções");
                continue;
            }
            switch (escolha){
                case 0:
                    break;
                case 1:
                    System.out.println("Digite as informações da pessoa");
                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    myPetshop.addPessoa(nome,cpf);
                    break;
                case  2:
                    System.out.println("Digite o cpf do dono e as informações do Cachorro");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();

                    try {
                        myPetshop.verificaCpf(cpf);
                    }catch (CpfDoesntMetchException e){
                        System.out.println(e.getClass() + ": " + e.getMessage());
                    }

                    System.out.println("Nome do Cachorro: ");
                    nomeCachorro = leitor.nextLine();
                    System.out.println("Raca do Cachorro: ");
                    String racaCachorro = leitor.nextLine();
                    System.out.println("Cachorro é vacinado? Sim[1]/Nao[!= de 1]: ");

                    try {
                        boolean vacinado = leitor.nextInt() == 1;
                        leitor.nextLine();
                        myPetshop.addCachorro(cpf,nomeCachorro,racaCachorro,vacinado);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getClass() + ": Valor invalido! Digite um numero dentre as opções");
                    }

                    break;
                case 3:
                    try {
                        myPetshop.listPessoas();
                    } catch (EmptyStructureException e) {
                        System.out.println(e.getClass() + ": " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Deseja exibir os cachorros de um cliente especifico? Sim[1]/Não[2]");
                    System.out.println("Deseja listar os cachorros vacinados[1] ou os não vacinados[2]?");
                    boolean clienteEspecifico;
                    boolean exibirVacinados;
                    try {
                        clienteEspecifico = leitor.nextInt() == 1;
                        exibirVacinados = leitor.nextInt() == 1;
                    } catch (InputMismatchException e) {
                        System.out.println(e.getClass() + ": Valor invalido! Digite um numero dentre as opções");
                        break;
                    }
                    if (clienteEspecifico){
                        leitor.nextLine();
                        System.out.println("Digite o cpf do dono");
                        System.out.println("Cpf: ");
                        cpf = leitor.nextLine();
                        try {
                            myPetshop.listVacinados(exibirVacinados,cpf);
                        } catch (Exception e) {
                            System.out.println(e.getClass() + ": " + e.getMessage());
                        }
                    }
                    else{
                        try {
                            myPetshop.listVacinados(exibirVacinados);
                        } catch (EmptyStructureException e) {
                            System.out.println(e.getClass() + ": " + e.getMessage());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o cpf do dono");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    try {
                        myPetshop.verificaCpf(cpf);
                        myPetshop.listCachorros(cpf);
                    }catch (Exception e){
                        System.out.println(e.getClass() + ": " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Digite o cpf de quem deseja remover");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    try {
                        myPetshop.removePessoa(cpf);
                    } catch (Exception e) {
                        System.out.println(e.getClass() + ": " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("digite o cpf do dono e o nome do cachorro que deseja remover");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    System.out.println("Nome do Cachorro: ");
                    nomeCachorro = leitor.nextLine();
                    try {
                        myPetshop.removeCachorro(cpf,nomeCachorro);
                    } catch (Exception e) {
                        System.out.println(e.getClass() + ": " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Resposta invalida, digite um numero dentre as opções");
                    break;
            }
        }
    }
    public static int menu(){
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("-=-=-=- MeuPetShop -=-=-=-");
        System.out.println("Escolha sua acao: ");
        System.out.println("addPessoa........[1]");
        System.out.println("addCachorro......[2]");
        System.out.println("listPessoas......[3]");
        System.out.println("listVacinados....[4]");
        System.out.println("listCachorros....[5]");
        System.out.println("removePessoa.....[6]");
        System.out.println("removeCachorro...[7]");
        System.out.println("Sair.............[0]");
        return leitor.nextInt();
    }


}
