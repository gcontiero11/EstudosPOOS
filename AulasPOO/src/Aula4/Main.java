package Aula4;


public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[150];
        double somaDasAreas = 0;
        for (int i = 0 ; i < figuras.length ; i++){
            if (i<50){
                Circulo circ = new Circulo();
                circ.raio = i + 1;
                double areaCirculo = circ.area();
                somaDasAreas += areaCirculo;
                figuras[i] = circ;
            }
            else if (i<100) {
                Retangulo retan = new Retangulo();
                retan.largura = i - 49;
                retan.comprimento = i - 49;
                double areaRetangulo = retan.area();
                somaDasAreas += areaRetangulo;
                figuras[i] = retan;
            }
            else{
                Triangulo tri = new Triangulo();
                tri.l1 = i - 99;
                tri.l2 = i - 99;
                tri.l3 = i - 99;
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
        System.out.println(somaDasAreas);
    }
}
