package utfpr.exercicios.lista03.ex02;

public class Disciplina {
    private int codDisciplina;
    private String nomeDisciplina;
    private String modalidade;
    private int horas;
    private String conteudoProgramatico;

    public Disciplina(int codDisciplina, String nomeDisciplina, String modalidade, int horas, String conteudoProgramatico) {
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.modalidade = modalidade;
        this.horas = horas;
        this.conteudoProgramatico = conteudoProgramatico;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getModalidade() {
        return modalidade;
    }

    public int getHoras() {
        return horas;
    }

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }

    public void exibirRelatorio(){
        System.out.println("=== Relatório da Disciplina ===");
        System.out.println("Código: " + codDisciplina);
        System.out.println("Nome: " + nomeDisciplina);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Horas: " + horas);
        System.out.println("Conteúdo Programático: " + conteudoProgramatico);
        System.out.println("===============================");
    }
}
