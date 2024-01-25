package Aula2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Todos os Natais o Papai Noel se prepara para embarcar em seu trenó todos os N presentes a serem entregues.
    A área em que os presentes ficam no trenó pode ser dividida em dois lados: o lado A e o lado B. Para que o trenó
    fique equilibrado, a diferença da soma dos pesos dos presentes que estão no lado A e no lado B não pode ser maior
    que 5kg.

    Você recebeu a tarefa de ajudar o Papai Noel este ano. Dados N presentes, você deve descobrir se existe uma
    maneira de dividi-los nos lados A e B, de tal forma que o trenó nunca fique desequilibrado.

    Faça um programa que leia o número de presentes N que o Papai Noel deve entregar. Após isso, leia N números
    inteiros P, representando o peso de cada presente. Os presentes devem ser alocados um por vez, na ordem em que
    são lidos, e em nenhum momento o trenó deve ficar desequilibrado. Seu programa deve imprimir "S" se for possível
    equilibrar todos os presentes no trenó e "N" caso contrário.

    Exemplos de entrada e saída:

    | Entrada      | Saída  |
    | -------      | ------ |
    | 3            | S      |
    | 4 6 2        |        |
    | -------      | ------ |
    | 2            | N      |
    | 6 6          |        |


    Fonte: Adaptado de https://neps.academy/problem/436
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex08 ex = new Ex08();
        int tamanho = leitor.nextInt();
        int[] giftsWeights = new int[tamanho];
        ex.compute(giftsWeights);
    }

    String compute(int[] giftsWeights) {
        String output = null;
        int aSide = 0;
        int bSide = 0;
        int weightDiference = aSide - bSide;
        output = "S";
        for(int gift : giftsWeights){
            if (weightDiference > 5 || weightDiference < -5){
                output = "N";
                break;
            }
            if (weightDiference > 0){
                bSide += gift;
            }
            else{
                aSide += gift;
            }
            weightDiference = aSide - bSide;
        }
        return output;
    }

}
