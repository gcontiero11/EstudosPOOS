public class Exercicios {
    int exercicioEscolhido;

    public Exercicios(int exercicioEscolhido){
        this.exercicioEscolhido = exercicioEscolhido;
    }

    public void selecionaExercicio(){
        if(exercicioEscolhido == 1){
            this.ex001();
        } else if (exercicioEscolhido == 2) {
            this.ex002();
        } else if (exercicioEscolhido == 0) {
            System.out.println("Saindo...");
        } else{
            System.out.println("Exercicio não encontrado!");
        }

    }
    private void ex001(){
        System.out.println("Executando exercício 1");
    }
    private void ex002(){
        System.out.println("Executando exercício 2");
    }
}
