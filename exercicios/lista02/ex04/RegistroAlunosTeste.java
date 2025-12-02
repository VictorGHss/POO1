package utfpr.exercicios.lista02.ex04;

public class RegistroAlunosTeste {
    public static void main(String[] args) {
        // Criando um aluno para teste
        RegistroAlunos aluno1 = new RegistroAlunos(
                12345,
                "João Silva",
                "Ciência da Computação",
                Turno.MANHÃ,
                8.5,
                Situacao.REGULAR);

        // Testando o método de chamada
        System.out.println("=== TESTANDO CHAMADA ===");
        aluno1.responderChamada("João Silva", 12345);
        System.out.println();

        // Testando o método de avaliação (interativo)
        System.out.println("=== INICIANDO AVALIAÇÃO ===");
        System.out.println("O sistema irá fazer 3 perguntas. Responda com cuidado!");
        System.out.println();

        // Chamando o método de avaliação - agora o usuário responderá interativamente
        aluno1.fazerAvaliacao("João Silva", 12345, 30); // 30 pontos no total
    }
}