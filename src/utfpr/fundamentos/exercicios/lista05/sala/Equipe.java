package utfpr.fundamentos.exercicios.lista05.sala;

public class Equipe {
    private String nome;
    private int numMembros;
    private int horaInicial;

    public Equipe(String nome, int numMembros, int horaInicial) {
        this.nome = nome;
        this.numMembros = numMembros;
        this.horaInicial = horaInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getNumMembros() {
        return numMembros;
    }

    public int getHoraInicial() {
        return horaInicial;
    }
}
