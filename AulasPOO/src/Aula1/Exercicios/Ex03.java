package Aula1.Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ano = leitor.nextInt();
        Ex03 ex = new Ex03();
        String output = ex.compute(ano);
        System.out.println(output);
    }


    String compute(int input) {
        String output;
        if(input <= 0){
            output = "Erro";
            return output;
        }

        if (input % 4 == 0 && input % 100 != 0) output = "Ano bissexto";
        else if(input % 400 == 0) output = "Ano bissexto";
        else output = "Ano nao bissexto";
        return output;
    }
}
