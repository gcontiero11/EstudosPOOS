package Aula1.Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Ex06 ex = new Ex06();
        Scanner leitor = new Scanner(System.in);
        final double WIDTH = leitor.nextDouble();
        final double HEIGHT = leitor.nextDouble();
        final double INK_COST = leitor.nextDouble();
        final double INK_EFFICIENCY = leitor.nextDouble();
        ex.compute(WIDTH,HEIGHT,INK_COST,INK_EFFICIENCY);
    }

    String compute(double WIDTH, double HEIGHT, double INK_COST, double INK_EFFICIENCY) {
        String output = null;
        double area = WIDTH * HEIGHT;
        int numberOfTins = (int) Math.ceil(area/INK_EFFICIENCY) ;
        double totalCost = numberOfTins * INK_COST ;
        output = numberOfTins + String.format(" %.2f",totalCost).replaceAll(",",".");
        System.out.println(output);
        return output;
    }
}
