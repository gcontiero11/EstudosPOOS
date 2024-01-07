package Aula1.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex07 ex = new Ex07();
        final int LIMIT = leitor.nextInt();
        final double KM_VALUE1 = leitor.nextDouble();
        final double KM_VALUE2 = leitor.nextDouble();
        final double TOTAL_KM = leitor.nextDouble();
        ex.compute(LIMIT,KM_VALUE1,KM_VALUE2,TOTAL_KM);
    }

    double compute(int limit, double kmValue1, double kmValue2, double totalKm) {
        double output = -0.1;

        if(totalKm <= limit)  output = totalKm * kmValue1;
        else  output = totalKm * kmValue2;
        System.out.println(output);



        return output;
    }
}
