package utfpr.fundamentos.exercicios.lista05.supermercado;

public class Cliente {
    private String nome;
    private int numPedido;
    private int horaChegada;

    public Cliente(String nome, int numPedido, int horaChegada) {
        this.nome = nome;
        this.numPedido = numPedido;
        this.horaChegada = horaChegada;
    }

    public String getNome() {
        return nome;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public int getHoraChegada() {
        return horaChegada;
    }
}
