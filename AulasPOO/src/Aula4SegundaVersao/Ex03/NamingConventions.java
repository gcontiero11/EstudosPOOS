package Aula4SegundaVersao.Ex03;

public abstract class NamingConventions {

    public enum  Conventions {CLASS,METHOD,VARIABLE,CONSTANT}
    public static boolean isFollowingConvetion(String name,Conventions convention){
        char[] nameCharArr = name.toCharArray();
        char firstChar = nameCharArr[0];
        if (convention == Conventions.METHOD || convention == Conventions.VARIABLE){
            if (Character.isUpperCase(firstChar)){
                System.out.println("O nome não esta seguindo as convencoes de METODOS e VARIAVEIS");
                return false;
            }
        }
        else if(convention == Conventions.CLASS){
            if (Character.isLowerCase(firstChar)){
                System.out.println("O nome não esta seguindo as convencoes de CLASSE");
                return false;
            }
        }
        else{
            for (char c : nameCharArr){
                if (firstChar == '_' || firstChar == '$') return false;
                if (Character.isLowerCase(c)){
                    if (c != '_'){
                        System.out.println("O nome não esta seguindo as convencoes de CONSTANTE");
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static String fromConstToVariable(String name){
        char[] nameCharArr = name.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : nameCharArr){
            result.append(Character.toLowerCase(c));
        }
        name = result.toString();
        return name;
    }
    public static String fromVariableToConst(String name){
        char[] nameCharArr = name.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : nameCharArr){
            result.append(Character.toUpperCase(c));
        }
        name = result.toString();
        return name;
    }

    public static boolean hasValidJavaIdentifier(String name){
        char[] nameCharArr = name.toCharArray();
        for (char c : nameCharArr){
            if (Character.isUpperCase(c)) return false;
        }
        return true;
    }
}
