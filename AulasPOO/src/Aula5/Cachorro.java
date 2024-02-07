package Aula5;

public class Cachorro {
    String nome;
    String raca;
    boolean vacinado;

    public Cachorro(String nome,String raca, boolean vacinado){
        this.nome = nome;this.raca = raca; this.vacinado = vacinado;
    }

    public void latir(String... latidos){
        for (String latido : latidos){
            System.out.println(latido);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vacinado=" + vacinado +
                '}';
    }
}
