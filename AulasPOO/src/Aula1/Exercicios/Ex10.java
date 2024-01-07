package Aula1.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex10 ex = new Ex10();
        int x1 = leitor.nextInt();
        int v1 = leitor.nextInt();
        int x2 = leitor.nextInt();
        int v2 = leitor.nextInt();
        ex.compute(x1,v1,x2,v2);
    }

    String compute(int x1, int v1, int x2, int v2) {
        String output = null;
        output = "NAO";
        if (x1<x2){
            while (x1<=x2){
                if (x1==x2){
                    output = "SIM";
                    System.out.println(output);
                    return output;
                }
                x1 += v1;
                x2 += v2;
            }
        }
        else {
            while (x2 <= x1) {
                if (x2 == x1) {
                    output = "SIM";
                    System.out.println(output);
                    return output;
                }
                x1 += v1;
                x2 += v2;
            }
        }
        System.out.println(output);
        return output;
    }
}
