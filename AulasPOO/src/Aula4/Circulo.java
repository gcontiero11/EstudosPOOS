package Aula4;

public class Circulo extends Figura {
    protected double raio;

    @Override
    public double area(){
        return  2 * Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
