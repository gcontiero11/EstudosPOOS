package Aula2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex06 ex = new Ex06();
        final int TAMANHO_ARRAYS = leitor.nextInt();

        int[] arr1 = new int[TAMANHO_ARRAYS];
        for (int i = 0; i < TAMANHO_ARRAYS ; i++) arr1[i] = leitor.nextInt();

        int[] arr2 = new int[TAMANHO_ARRAYS];
        for (int i = 0; i < TAMANHO_ARRAYS ; i++) arr2[i] = leitor.nextInt();

        ex.compute(arr1,arr2);
    }

    String compute(int[] arrayA, int[] arrayB) {
        String output = null;
        final int TAMANHO_ARRAY_C = (arrayA.length) * 2;
        int[] arrayC = new int[TAMANHO_ARRAY_C];
        int contadorA = 0;
        int contadorB = 0;
        for (int i = 0; i < TAMANHO_ARRAY_C; i++) {
            if (i % 2 == 0){
                arrayC[i] = arrayA[contadorA];
                contadorA++;
            }
            else {
                arrayC[i] = arrayB[contadorB];
                contadorB++;
            }
        }
        output = "";
        for (int i = 0; i< TAMANHO_ARRAY_C-1 ; i++){
            output += arrayC[i] + " ";
        }
        output += arrayC[TAMANHO_ARRAY_C - 1];
        System.out.println(output);
        return output;
    }
}
