package Aula1.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex09 ex = new Ex09();
        int i;
        String input = leitor.nextLine();
        String[] numerosEmString = input.split(" ");
        int tamanho = numerosEmString.length;
        int[] arr = new int[tamanho];

        for(i = 0; i< tamanho; i++){
            arr[i] = Integer.parseInt(numerosEmString[i]);
        }
        ex.compute(arr);
    }

    String compute(int[] input) {
        String output = null;
        input = retiraUltimoNumero(input);

        double tamanho = input.length;
        double media = calculaMedia(input);
        double qntMaiorIdade = contaMaioresDeIdade(input);
        double qntIdosos = contaIdosos(input);
        double porcentagemIdosos = calculaPorcentagem(qntIdosos, tamanho);

        output = String.format("%.2f %.0f %.2f%%",media,qntMaiorIdade,porcentagemIdosos).replaceAll("," , ".");
        System.out.println(output);
        return output;
    }
    private int[] retiraUltimoNumero(int[] input){
        int tamanhoNovoArr = input.length - 1;
        int i;
        int[] arrayFinal = new int[tamanhoNovoArr];
        for(i=0;i<tamanhoNovoArr;i++){
            arrayFinal[i] = input[i];
        }
        return arrayFinal;
    }

    private double calculaMedia(int[] input){
        int quantidadeDeNumeros = input.length;
        int somatorio = 0;
        double media;
        for(int i : input){
            somatorio += i;
        }
        media = (double) somatorio/quantidadeDeNumeros;
        return media;
    }

    private double contaIdosos(int[] input){
        double qntIdosos = 0;
        for(int idade : input){
            qntIdosos += (idade>75) ?  (1):(0);
        }
        return qntIdosos;
    }

    private double contaMaioresDeIdade(int[] input){
        double qntMaioresIdade = 0;
        for(int idade : input){
            qntMaioresIdade += (idade>=18) ?  (1):(0);
        }
        return qntMaioresIdade;
    }

    private double calculaPorcentagem(double parte, double todo){
        return (parte/todo)*100;
    }
}
