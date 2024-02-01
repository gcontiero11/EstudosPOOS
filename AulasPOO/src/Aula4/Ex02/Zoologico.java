package Aula4.Ex02;

class Zoologico {
    Animal[] animais;

    protected Zoologico(Animal[] animais){
        this.animais = animais;
    }
    void verificarJaulas(){
        for (Animal an : animais){
            an.emitirSom();
            if(an instanceof Leao){
                ((Leao) an).correr();
            }
            else if (an instanceof Lobo){
                ((Lobo) an).correr();
            }
        }
    }
}
