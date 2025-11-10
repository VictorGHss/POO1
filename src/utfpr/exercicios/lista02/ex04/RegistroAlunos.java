package utfpr.exercicios.lista02.ex04;

import java.util.Scanner;

public class RegistroAlunos {
    private int ra;
    private String nome;
    private String curso;
    private Turno turno;
    private double coeficiente;
    private Situacao situacao;
    private int presenca;
    private int qntdAulas;

    public RegistroAlunos(int ra, String nome, String curso, Turno turno, double coeficiente, Situacao situacao) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.coeficiente = coeficiente;
        this.situacao = situacao;
        this.presenca = 0;
        this.qntdAulas = 5; // 5 aulas por semana
    }

    public void responderChamada(String nome, int ra) {
        System.out.println(nome + " presente!");
        if (this.presenca >= this.qntdAulas) {
            System.out.println("O aluno: " + nome + ", esteve presente em todas as aulas.");
        } else {
            presenca += 1;
            System.out.println("Presença do aluno " + nome + " registrada com sucesso");
        }

    }

    public void fazerAvaliacao(String nome, int ra, int valorProva) {
        Scanner scanner = new Scanner(System.in);
        int pontuacaoObtida = 0;
        int pontosPorQuestao = valorProva / 3;

        System.out.println("=== Avaliação do aluno: " + nome + " (RA: " + ra + ") ===");
        System.out.println("Valor total da prova: " + valorProva + " pontos\n");

        // Questão 1
        System.out.println("Questão 1: Quanto é 4 + 4?");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();
        if (resposta1 != null && resposta1.trim().equals("8")) {
            System.out.println("✓ Resposta 1 correta! (+" + pontosPorQuestao + " pontos)");
            pontuacaoObtida += pontosPorQuestao;
        } else {
            System.out.println("✗ Resposta 1 incorreta.");
        }
        System.out.println();

        // Questão 2
        System.out.println("Questão 2: Quem é o atual presidente do Brasil?");
        System.out.print("Sua resposta: ");
        String resposta2 = scanner.nextLine();
        if (resposta2 != null && resposta2.trim().equalsIgnoreCase("Lula")) {
            System.out.println("✓ Resposta 2 correta! (+" + pontosPorQuestao + " pontos)");
            pontuacaoObtida += pontosPorQuestao;
        } else {
            System.out.println("✗ Resposta 2 incorreta. Resposta correta: Lula");
        }
        System.out.println();

        // Questão 3
        System.out.println("Questão 3: Qual é a capital do Brasil?");
        System.out.print("Sua resposta: ");
        String resposta3 = scanner.nextLine();
        if (resposta3 != null && resposta3.trim().equalsIgnoreCase("Brasilia")) {
            System.out.println("✓ Resposta 3 correta! (+" + pontosPorQuestao + " pontos)");
            pontuacaoObtida += pontosPorQuestao;
        } else {
            System.out.println("✗ Resposta 3 incorreta. Resposta correta: Brasilia");
        }

        // Resultado final
        System.out.println();
        System.out.println("=== Resultado Final ===");
        System.out.println("Pontuação obtida: " + pontuacaoObtida + "/" + valorProva);
        double notaFinal = (double) pontuacaoObtida / valorProva * 10;
        System.out.printf("Nota final: %.2f/10.0\n", notaFinal);

        if (notaFinal >= 7.0) {
            System.out.println("Status: APROVADO! 🎉");
        } else if (notaFinal >= 5.0) {
            System.out.println("Status: RECUPERAÇÃO 📚");
        } else {
            System.out.println("Status: REPROVADO 😞");
        }
    }

}