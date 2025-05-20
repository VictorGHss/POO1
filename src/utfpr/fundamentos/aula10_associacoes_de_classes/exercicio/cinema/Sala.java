package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

import java.util.ArrayList;
import java.util.List;

public class Sala implements TemplateCinema {
    private int numeroSala;
    private int capacidade;

    public Sala(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void cadastrar() {
        System.out.println("Sala " + numeroSala + " cadastrada com capacidade para " + capacidade + " pessoas.");
    }

    @Override
    public void editar() {
        System.out.println("Sala " + numeroSala + " editada.");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando Sala " + numeroSala + ".");
    }

    @Override
    public void remover() {
        System.out.println("Sala " + numeroSala + " removida.");
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroSala=" + numeroSala +
                ", capacidade=" + capacidade +
                '}';
    }
}