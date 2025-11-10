package utfpr.exercicios.lista04.ex02;

public class Disciplinas {
    private String nomeDisciplina;
    private Integer codDisciplina;
    private Integer cargaHoraria;
    private Modalidade modalidade;
    private Professor professor;

    public Disciplinas(String nomeDisciplina, Integer codDisciplina, Integer cargaHoraria, Modalidade modalidade, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codDisciplina = codDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.professor = professor;
    }

    public void exibirDados(){
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Código da Disciplina: " + codDisciplina);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Modalidade: " + modalidade);
        professor.exibirDados();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Integer getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(Integer codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
