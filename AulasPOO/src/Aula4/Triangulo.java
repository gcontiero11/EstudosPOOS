package Aula4;

public class Triangulo extends Figura{
    protected double l1;
    protected double l2;
    protected double l3;

    @Override
    public double area() {
        return ((l1 * l1) * Math.sqrt(3))/4 ;
    }

    public  Triangulo(double l1, double l2 , double l3){
        this.l1 = l1 ;this.l2 = l2;this.l3 = l3;
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
