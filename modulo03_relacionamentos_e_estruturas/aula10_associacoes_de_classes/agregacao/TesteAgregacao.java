package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.agregacao;

public class TesteAgregacao {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Analise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Bacharelado em Ciência da Computação");

        Aluno aluno1 = new Aluno("Victor Gabriel", "26777555");
        Aluno aluno2 = new Aluno("Bhor Habill", "11092001");
        Aluno aluno3 = new Aluno("Ted Kaczynski", "27180912");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        // Listando alunos dos cursos
        curso1.listarAlunos();
        curso2.listarAlunos();

        // Removendo um aluno
        System.out.println("\nRemovendo Bhor Habill do curso de Engenharia de Software...");
        curso1.removerAluno(aluno2);

        // Listando novamente
        curso1.listarAlunos();
        curso2.listarAlunos();
    }
}
