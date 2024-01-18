package Aula2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Ex03 ex = new Ex03();
        int[] firstFive = new int[10];
        for(int i = 0; i < 5 ; i++) firstFive[i] = leitor.nextInt();
        leitor.nextLine();
        String str = leitor.nextLine();
        String[] strArr = str.split(" ");
        int tamanho = strArr.length;
        int[] otherInts = new int[tamanho];
        for (int i = 0; i < tamanho;i++) otherInts[i] = Integer.parseInt(strArr[i]);
        ex.compute(firstFive,otherInts);
    }

    String compute(int[] firstFive, int[] otherInts) {
        int[] primeirosCinco = new int[10];
        int livreFirstFive = 5;
        for (int i = 0; i < 5; i++) primeirosCinco[i] = firstFive[i];
        String output = "";
        printArrInt(primeirosCinco,livreFirstFive);
        boolean numeroRepetido = arrComNumerosRepetidos(firstFive,livreFirstFive);
        if(!numeroRepetido){
            output += printArrInt(primeirosCinco,livreFirstFive) + "\n";
            int j = 0;
            while (livreFirstFive>0 && livreFirstFive < 10){
                int indexNumeroEncontrado = buscaNumero(otherInts[j],primeirosCinco,livreFirstFive);
                if( indexNumeroEncontrado <= 10){
                    primeirosCinco = retiraNumero(primeirosCinco,indexNumeroEncontrado,livreFirstFive);
                     livreFirstFive--;
                     if(livreFirstFive>0){
                         if (livreFirstFive == 1){
                            output += printArrInt(primeirosCinco,livreFirstFive);
                         }
                         else{
                            output += printArrInt(primeirosCinco,livreFirstFive) + "\n";
                         }
                     }
                }
                else {
                    System.out.println(primeirosCinco.length);
                    primeirosCinco[livreFirstFive] = otherInts[j];
                    livreFirstFive++;
                    if (livreFirstFive == 2){
                        output += "\n" + printArrInt(primeirosCinco,livreFirstFive) + "\n";
                    }
                    else if(livreFirstFive == 10){
                        output += printArrInt(primeirosCinco,livreFirstFive);
                    }
                    else{
                        output += printArrInt(primeirosCinco,livreFirstFive) + "\n";
                    }
                }
                j++;
            }
        }
        else{
            output = "Erro";
        }
        return output;

    }

    private static String printArrInt (int[] arr, int livre){
        String str = "";
        final int ULTIMO_INDEX = livre - 1;
        for(int i = 0; i < livre - 1;i++) str += arr[i] + " ";
        str += arr[ULTIMO_INDEX];
        System.out.println(str);
        return str;
    }

    private static void printArrStr (String[] arr, int livre){
        String str = "Strings: ";
        final int ULTIMO_INDEX = livre - 1;
        for(int i = 0; i < livre - 1;i++) str += arr[i] + " ";
        str += arr[ULTIMO_INDEX];
        System.out.println(str);

    }

    private static int buscaNumero (int numero,int[] arr,int livre){
        for(int i = 0 ; i < livre; i++){
            if(numero == arr[i]){
                return i;
            }
        }
        return 11;
    }

    private static boolean arrComNumerosRepetidos(int[] arr,int livre){
        for(int i = 0 ; i < livre; i++){
            for (int j = 0; j < livre; j++){
                if (arr[i] == arr[j] && i != j) return true;
            }
        }
        return false;
    }

    private static int[] retiraNumero (int[] arr , int index, int livre){
        for (int i = index; i < livre-1; i++){
            arr[i] = arr[i+1];
        }
        return arr;
    }
}
