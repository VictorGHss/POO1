package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.exercicio.cinema;

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