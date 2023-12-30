package Aula1.Exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        String retorno = "Erro";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros: ");
        int numeroDeLivros = leitor.nextInt();
        if(numeroDeLivros > 0){
            float criterioA = (numeroDeLivros * 0.25f) + 7.5f;
            float criterioB = (numeroDeLivros * 0.50f) + 2.50f;

            if(criterioA > criterioB) retorno = "Critério B";
            else if (criterioA < criterioB) retorno = "Critério A";
            else retorno = "Indiferente";
        }
        System.out.println(retorno);
    }
}
