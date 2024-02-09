package Aula6;


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
            escolha = menu();
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
                    System.out.println("Nome do Cachorro: ");
                    nomeCachorro = leitor.nextLine();
                    System.out.println("Raca do Cachorro: ");
                    String racaCachorro = leitor.nextLine();
                    System.out.println("Cachorro é vacinado? Sim[1]/Nao[2]: ");
                    boolean vacinado = leitor.nextInt() == 1;
                    myPetshop.addCachorro(cpf,nomeCachorro,racaCachorro,vacinado);

                    break;
                case 3:
                    myPetshop.listPessoas();
                    break;
                case 4:
                    System.out.println("Digite o cpf do dono");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    try {
                        myPetshop.listCachorros(cpf);
                    }catch (EmptyStructure e){
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Digite o cpf de quem deseja remover");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    try {
                        myPetshop.removePessoa(cpf);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("digite o cpf do dono e o nome do cachorro que deseja remover");
                    System.out.println("Cpf: ");
                    cpf = leitor.nextLine();
                    System.out.println("Nome do Cachorro: ");
                    nomeCachorro = leitor.nextLine();
                    try {
                        myPetshop.removeCachorro(cpf,nomeCachorro);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    System.out.println("Deseja exibir os cachorros de um cliente especifico? Sim[1]/Não[2]");
                    System.out.println("Deseja listar os cachorros vacinados[1] ou os não vacinados[2]?");
                    boolean clienteEspecifico = leitor.nextInt() == 1;
                    boolean exibirVacinados = leitor.nextInt() == 1;
                    if (clienteEspecifico){
                        System.out.println("Digite o nome do dono");
                        cpf = leitor.nextLine();
                        myPetshop.listVacinados(exibirVacinados,cpf);
                    }
                    else{
                        myPetshop.listVacinados(exibirVacinados);
                    }
                    break;
                default:
                    System.out.println("Resposta invalida , tente digitar um numero dentre as opções");
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
        System.out.println("listCachorros....[4]");
        System.out.println("removePessoa.....[5]");
        System.out.println("removeCachorro...[6]");
        System.out.println("Sair.............[0]");
        return leitor.nextInt();
    }
}
