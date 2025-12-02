package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos(){
        System.out.println("Alunos do curso " + nomeCurso + ":");
        for (Aluno a : alunos){
            System.out.println(" - " + a);
        }
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno matriculado.");
        }
    }

}
