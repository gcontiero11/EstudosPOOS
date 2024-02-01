package Aula4.Ex02;

class Main {
    public static void main(String[] args) {
        Animal[] animals = criandoAnimais();
        Zoologico zoo = new Zoologico(animals);
        zoo.verificarJaulas();
    }

    private static Animal[] criandoAnimais(){
        Animal animal1 = new Leao();
        Animal animal2 = new Coruja();
        Animal animal3 = new Lobo();
        Animal animal4 = new Leao();
        Animal animal5 = new Coruja();
        Animal animal6 = new Lobo();
        Animal animal7 = new Lobo();
        Animal animal8 = new Leao();
        Animal animal9 = new Coruja();
        Animal animal10 = new Coruja();
        Animal[] animals = {animal1,animal2,animal3,animal4,animal5,animal6,animal7,animal8,animal9,animal10};
        return animals;

    }
}
