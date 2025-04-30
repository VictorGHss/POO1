package utfpr.fundamentos.exercicios.lista05.biblioteca;

public class BibliotecaUTFPR {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Não faz sentido! Por trás da câmeras", "Felipe Neto", "Panini", 2013, 280);

        Aluno aluno1 = new Aluno("Victor Gabriel", "2677555");

        // Informações do livro
        System.out.println("===== Dados sobre o Livro =====");
        livro1.imprimirInfo();
        System.out.println();

        System.out.println("====== Empréstimo =====");
        livro1.emprestar(5, aluno1.getNome());
        System.out.println();

        System.out.println("====== Novo Empréstimo ====="); // Não deve funcionar
        livro1.emprestar(6, aluno1.getNome());
        System.out.println();

        System.out.println("===== Devolver =====");
        livro1.devolver(16); // devolve no dia 13 = 8 dias com o livro = 1 dia de multa
        System.out.println();

        System.out.println("===== Informações finais =====");
        livro1.imprimirInfo();
    }
}