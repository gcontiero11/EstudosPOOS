package Aula4SegundaVersao.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        String stringPricipal = leitor.nextLine();
        String subString = leitor.nextLine();
        int stringsContadas = contadorDeStrings(stringPricipal,subString);
        System.out.println(String.format("O numero de Strings contadas foi: " + stringsContadas));
    }

    public static int contadorDeStrings(String str, String subString){
        int strSize = str.length();
        int subStringSize = subString.length();
        int stringsContadas = 0;
        char[] strCharArr = str.toUpperCase().toCharArray();
        char[] subStringCharArr = subString.toUpperCase().toCharArray();
        for (int i = 0; i < strSize; i++){
            int j = 0;
            while(strCharArr[i] == subStringCharArr[j]){
                j++;
                if (j == subStringSize){
                    stringsContadas += 1;
                    break;
                }
                i++;
            }
        }
        return stringsContadas;
    }
}
