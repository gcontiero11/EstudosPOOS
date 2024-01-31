package Aula4;

public class Triangulo extends Figura{
    protected double l1;
    protected double l2;
    protected double l3;

    @Override
    public double area() {
        return ((l1 * l1) * Math.sqrt(3))/4 ;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }
}
