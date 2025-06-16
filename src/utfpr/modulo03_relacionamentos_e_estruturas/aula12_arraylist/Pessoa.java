package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private int killcount;

    public Pessoa(String nome, int idade, double peso, int killcount) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.killcount = killcount;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public int getKillcount() {
        return killcount;
    }
}
