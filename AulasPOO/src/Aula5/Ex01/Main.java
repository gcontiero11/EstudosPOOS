package Aula5.Ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Email email = new Email(leitor.nextLine());
        if (email.validadorDeEmail()) System.out.println("EMAIL VALIDO!");
    }
}
