package Aula1.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex08 ex = new Ex08();
        int n = leitor.nextInt();
        int c = leitor.nextInt();
        ex.compute(n,c);
    }

    int compute(int n, int c) {
        int output = -1;
        int precoLimao = c;
        int i;
        output = 0;
        for(i=0;i<n;i++){
            output += precoLimao;
            precoLimao = (precoLimao > 1)? (precoLimao - 1):(1);
        }
        System.out.println(output);
        return output;
    }
}
