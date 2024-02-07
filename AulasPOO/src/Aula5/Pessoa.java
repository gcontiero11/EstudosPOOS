package Aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa {
    String nome;
    String cpf;
    List<Cachorro> cachorros;

    public Pessoa(String nome,String cpf){
        this.nome = nome; this.cpf = cpf;
        this.cachorros = new ArrayList<>();
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
