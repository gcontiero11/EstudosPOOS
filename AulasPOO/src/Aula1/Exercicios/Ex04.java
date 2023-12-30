package Aula1.Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int verba = leitor.nextInt();
        int precoChocolate = leitor.nextInt();
        int embalagensDesconto = leitor.nextInt();
        Ex04 ex = new Ex04();
        ex.compute(verba,precoChocolate,embalagensDesconto);
    }

    int compute(int verba, int precoChocolate, int embalagensDesconto) {
        int output =  -1;
        int chocolatesExtras;
        int embalagensTotais;

        output = verba/precoChocolate;
        embalagensTotais = output;

        while (embalagensTotais >= embalagensDesconto){
            chocolatesExtras = embalagensTotais/embalagensDesconto;
            output += chocolatesExtras;
            embalagensTotais -= embalagensDesconto * chocolatesExtras;
            embalagensTotais += chocolatesExtras;
        }

        System.out.println(output);
        return output;
    }
}
