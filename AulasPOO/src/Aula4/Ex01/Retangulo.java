package Aula4.Ex01;

import Aula4.Ex01.Figura;
class Retangulo extends Figura {
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

    public Retangulo(){
    }

    public Retangulo(double l , double c){
        this.largura = l; this.comprimento = c;
    }

}
