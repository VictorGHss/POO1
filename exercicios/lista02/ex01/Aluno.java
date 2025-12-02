package utfpr.exercicios.lista02.ex01;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;
    private String turno;
    private String periodo;
    private Long coeficiente;
    private String situacao;

    public Aluno(String nome, String ra, String curso, String turno, String periodo, Long coeficiente, String situacao) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.turno = turno;
        this.periodo = periodo;
        this.coeficiente = coeficiente;
        this.situacao = situacao;
    }

    public void responderChamada(){
        System.out.println("Aluno " + nome + " respondeu a chamada.");
    }
    public void fazerProva(){
        System.out.println("Aluno " + nome + " fez a prova.");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", curso='" + curso + '\'' +
                ", turno='" + turno + '\'' +
                ", periodo='" + periodo + '\'' +
                ", coeficiente=" + coeficiente +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
