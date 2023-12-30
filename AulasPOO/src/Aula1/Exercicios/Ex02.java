package Aula1.Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Lado A:");
        int ladoA = leitor.nextInt();
        System.out.println("Lado B:");
        int ladoB = leitor.nextInt();
        System.out.println("Lado C:");
        int ladoC = leitor.nextInt();

        Ex02 ex = new Ex02();
        System.out.println(ex.compute(ladoA,ladoB,ladoC));

    }

    String compute(int a, int b, int c) {
        String output;
        if(a <= 0 || b <= 0 || c<=0){
            output = "Erro";
            return output;
        }
        if (a+b>c && a+c>b && a+b>c){
            if (a == b && b == c) output = "Equilatero";
            else if (a != b && b != c && c != a) output = "Escaleno";
            else output = "Isosceles";
        }
        else{
            output = "Nao forma triangulo";
        }
        return output;
    }
}
