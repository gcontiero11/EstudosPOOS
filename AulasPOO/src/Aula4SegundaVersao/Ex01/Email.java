package Aula4SegundaVersao.Ex01;


public class Email {
    String email;

    /* O que eu vou considerar como email válido:
        - Não pode conter espaços
        - tem que obedecer este formato : *******@gmail.com
        - deve ter no mínimo 4 e no maximo 30 caracteres antes do @
        - Deve ter apenas um @
        - Deve conter apenas letras, numeros e pontos antes do @
        - Não pode haver apenas pontos antes do @.
     */

    Email(String email){
        this.email = email;
    }

    Boolean validadorDeEmail(){
        if (! existeArroba(email)){
            System.out.println("Nao possui arroba");
            return false;
        }
        if (! validaAntesDoArroba(email)){
            System.out.println("Nao esta valido antes do @");
            return false;
        }
        if (! validaDepoisDoArroba(email)){
            System.out.println("Nao esta valido depois do @");
            return false;
        }
        return true;
    }

    private static boolean existeArroba(String email){
        for (char c : email.toCharArray()){
            if (c == '@') return true;
        }
        return false;
    }
    private static boolean validaDepoisDoArroba(String email){
        final int TAMANHO_EMAIL = email.length();
        final int INDEX_ARROBA = email.indexOf("@");
        final String DEPOIS_DO_ARROBA = email.substring(INDEX_ARROBA,TAMANHO_EMAIL);
        if (DEPOIS_DO_ARROBA.equals("@gmail.com")) return true;
        if (DEPOIS_DO_ARROBA.equals("@gmail.com.br")) return true;
        return false;
    }
    private static boolean validaAntesDoArroba(String email){
        final int INDEX_ARROBA = email.indexOf("@");
        String antesDoArroba = email.substring(0,INDEX_ARROBA) ;
        if (! tamanhoCerto(antesDoArroba,4,30)){
            System.out.println("Tamanho esta errado");
            return false;
        };
        if (possuiApenasPontos(antesDoArroba)){
            System.out.println("Possui apenas pontos");
            return false;
        };
        if (possuiCaracteresEspeciais(antesDoArroba)){
            System.out.println("Possui caracteres especiais");
            return false;
        };
        return true;

    }
    private static boolean tamanhoCerto(String str, int min, int max){
        int tamanhoString = str.length();
        return ! (tamanhoString < min || tamanhoString > max);
    }
    private static boolean possuiCaracteresEspeciais(String str){

        final char[] CARACTERES_ESPECIAIS = {'?','@','#','$','%','^','&','*','(',')','+','=','<','>','!',';','-',',','`','~','{','}',' ','\\','\n'};

        for (char c : str.toCharArray()){
            for (char especialChar : CARACTERES_ESPECIAIS){
                if (c == especialChar) return true;
            }
        }
        return false;
    }
    private static boolean possuiApenasPontos(String str){
        int tamanho = str.length();
        int numeroDePontos = 0;
        for (char c : str.toCharArray()){
            if (c == '.') numeroDePontos += 1;
        }
        return (numeroDePontos == str.length());
    }
}
