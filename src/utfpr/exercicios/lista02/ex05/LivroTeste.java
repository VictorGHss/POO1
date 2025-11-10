package utfpr.exercicios.lista02.ex05;

public class LivroTeste {
    public static void main(String[] args) {
        // Criando um livro
        Livro livro1 = new Livro("Java - Como Programar", "Paul Deitel", "Editora Pearson", 968, 2016);

        System.out.println("=== Biblioteca UTFPR ===");

        System.out.println("\n--- TESTE 1: Empréstimo com sucesso ---");
        livro1.realizarEmprestimo("Victor", "Java - Como Programar");

        System.out.println("\n--- TESTE 2: Tentativa de empréstimo quando já está emprestado ---");
        livro1.realizarEmprestimo("Maria", "Java - Como Programar");

        System.out.println("\n--- TESTE 3: Tentativa de devolução por pessoa errada ---");
        livro1.realizarDevolucao("José", "Java - Como Programar");

        System.out.println("\n--- TESTE 4: Devolução correta ---");
        livro1.realizarDevolucao("Victor", "Java - Como Programar");

        System.out.println("\n--- TESTE 5: Tentativa de devolução quando já foi devolvido ---");
        livro1.realizarDevolucao("Victor", "Java - Como Programar");

        System.out.println("\n--- TESTE 6: Novo empréstimo após devolução ---");
        livro1.realizarEmprestimo("Ana", "Java - Como Programar");

    }
}
