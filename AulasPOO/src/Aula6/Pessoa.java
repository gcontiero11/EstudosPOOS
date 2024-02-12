package Aula6;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    String cpf;
    public List<Cachorro> cachorros;

    public Pessoa(String nome, String cpf){
        this.nome = nome; this.cpf = cpf;
        this.cachorros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Cachorro> getCachorros() {
        return cachorros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCachorros(List<Cachorro> cachorros) {
        this.cachorros = cachorros;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cachorros=" + cachorros +
                '}';
    }
}
