package utfpr.exercicios.lista02.ex01;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", "123456789", "Engenharia de Software", "Matutino", "1º Período", 3L, "Aprovado");
        Aluno aluno2 = new Aluno("Maria Oliveira", "987654321", "Ciência da Computação", "Vespertino", "2º Período", 4L, "Aprovado");

        System.out.println("===== Aluno 1 =====");
        System.out.println(aluno1);
        aluno1.responderChamada();
        aluno1.fazerProva();
        System.out.println();

        System.out.println("===== Aluno 2 =====");
        System.out.println(aluno2);
        aluno2.responderChamada();
        aluno2.fazerProva();
        System.out.println();
    }
}
