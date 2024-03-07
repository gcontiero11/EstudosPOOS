package Aula6;

public class Cachorro {

    String nome;
    String raca;
    boolean vacinado;

    public Cachorro(String nome, String raca, boolean vacinado){
        this.nome = nome;this.raca = raca; this.vacinado = vacinado;
    }

    public void latir(String... latidos){
        for (String latido : latidos){
            System.out.println(latido);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public Cachorro() {
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
