package Aula1.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Ex05 ex = new Ex05();
        final int SPEED_LIMIT = leitor.nextInt();
        final double TRAFFIC_FINE = leitor.nextDouble();
        final double ADICIONAL_VALUE = leitor.nextDouble();
        final int CAR_SPEED = leitor.nextInt();
        ex.compute(SPEED_LIMIT,TRAFFIC_FINE,ADICIONAL_VALUE,CAR_SPEED);
    }

    String compute(int SPEED_LIMIT, double TRAFFIC_FINE, double ADICIONAL_VALUE, int CAR_SPEED) {
        DecimalFormat deci = new DecimalFormat("0.00");
        String output =  null;
        if(CAR_SPEED > SPEED_LIMIT){
            output = String.format("%.2f",TRAFFIC_FINE + ADICIONAL_VALUE*(CAR_SPEED-SPEED_LIMIT));
            output = output.replaceAll(",",".");
        }
        else output = "0.00";
        return output;
    }
}
