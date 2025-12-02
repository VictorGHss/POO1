package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.agregacao;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nome + " (Matrícula: " + matricula + ")";
    }
}