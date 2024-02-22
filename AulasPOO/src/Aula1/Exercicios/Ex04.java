package Aula1.Exercicios;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int verba = leitor.nextInt();
        int precoChocolate = leitor.nextInt();
        int embalagensDesconto = leitor.nextInt();
        Ex04 ex = new Ex04();
        ex.compute(verba,precoChocolate,embalagensDesconto);
    }

    int compute(int myMoney, int chocolatePrice, int packagesForPromotion) {
        int boughtChocolates = 0;
        int numberOfPackages = 0;
        int earnedChocolates;

        boughtChocolates = myMoney/chocolatePrice;
        numberOfPackages = boughtChocolates;

        while (numberOfPackages >= packagesForPromotion){
            earnedChocolates = numberOfPackages / packagesForPromotion;
            boughtChocolates += earnedChocolates;
            numberOfPackages = (numberOfPackages % packagesForPromotion) + earnedChocolates;
        }

        System.out.println(boughtChocolates);
        return boughtChocolates;
    }
}
