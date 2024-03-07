package Aula5;

import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        int escolha = -1;
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
                    String cpf = leitor.nextLine();
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
