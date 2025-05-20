package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    private String nome;

    public Ator(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                '}';
    }
}