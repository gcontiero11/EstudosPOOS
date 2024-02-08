package Aula6;

public class NoDogsExeption extends Exception{
    public NoDogsExeption(String msg){
        System.out.println("NoDogsExeption: " + msg);
    }
}
