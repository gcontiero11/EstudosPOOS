package Aula4;


public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[150];
        double somaDasAreas = 0;
        for (int i = 0 ; i < figuras.length ; i++){
            if (i<50){
                int tamanho = i + 1;
                Circulo circ = new Circulo(tamanho);
                double areaCirculo = circ.area();
                somaDasAreas += areaCirculo;
                figuras[i] = circ;
            }
            else if (i<100) {
                double tamanho = i - 49;
                Retangulo retan = new Retangulo(tamanho, tamanho);
                double areaRetangulo = retan.area();
                somaDasAreas += areaRetangulo;
                figuras[i] = retan;
            }
            else{
                double tamanho = i - 99;
                Triangulo tri = new Triangulo(tamanho,tamanho,tamanho);
                double areaTriangulo = tri.area();
                somaDasAreas += areaTriangulo;
                figuras[i] = tri;
            }

        }
        int numeroDefiguras = 1;
        for (Figura f : figuras){
            System.out.println("Figura numero: " + numeroDefiguras + " " + f.toString() + "\n");
            numeroDefiguras += 1;
        }
        System.out.println(String.format("%.3f",somaDasAreas).replace(",","."));
    }
}
