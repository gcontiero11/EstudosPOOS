import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o exercicio que deseja executar: ");
        System.out.println("Ex001...[1]");
        System.out.println("Ex002...[2]");
        System.out.println("Sair....[0]");
        System.out.println("--------->");
        int escolha = leitor.nextInt();
        Exercicios exs = new Exercicios(escolha);
        exs.selecionaExercicio();
    }
}