package Aula2.Exercicios;

/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/

import javax.swing.text.TabableView;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ex02 {

    private final static int TAMANHO_LISTA = 5;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex02 ex = new Ex02();
        final int[] vetorA = new int[TAMANHO_LISTA];
        final int[] vetorB = new int[TAMANHO_LISTA];
        for(int i = 0; i<TAMANHO_LISTA;i++) vetorA[i] = leitor.nextInt();
        for(int i = 0; i<TAMANHO_LISTA;i++) vetorB[i] = leitor.nextInt();
        ex.compute(vetorA,vetorB);
    }

    String compute(int[] arrayA, int[] arrayB) {
        String output = "";
        int i;

        long[] arrayC = new long[TAMANHO_LISTA];

        for (i = 0; i<TAMANHO_LISTA; i++){
            arrayC[i] = (long) arrayA[i] + arrayB[i];
            if (arrayC[i] < Integer.MIN_VALUE || arrayC[i] > Integer.MAX_VALUE){
                System.out.println("Erro");
                return "Erro";
            }
        }

        for (i = 0; i<TAMANHO_LISTA-1;i++){
            output += arrayC[i] + ", ";

        }
        output += arrayC[i];

        System.out.println(output);
        return output;
    }
}
