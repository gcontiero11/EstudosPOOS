package Aula4;

public class Retangulo extends Figura {
    protected double largura;
    protected double comprimento;

    @Override
    public double area() {return largura * comprimento;}

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }

    public void retangulo(int x, int y, double l, double c){
        System.out.println(area());
    }

}
