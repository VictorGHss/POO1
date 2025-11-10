package utfpr.exercicios.lista04.ex05;

public class Local {
    //Atributos
    private String nomeLocal;
    private Endereco endereco; // COMPOSICAO: Um Local TEM UM Endereco
    private int capacidadeMaxima;

    //Construtor
    public Local(String nomeLocal, Endereco endereco, int capacidadeMaxima) {
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    //Getters e Setters

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}
