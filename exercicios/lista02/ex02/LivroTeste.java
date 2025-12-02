package utfpr.exercicios.lista02.ex02;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Como programar em Java", "Paul Deitel", "Editora Pearson", 2016, 300);
        Livro livro2 = new Livro("Aprenda Python", "Mark Lutz", "Editora O'Reilly", 2017, 400);

        System.out.println("==== Informações do Livro 1 ====");
        System.out.println(livro1);
        livro1.emprestar();
        System.out.println("\n==== Informações do Livro 1 após empréstimo ====");
        System.out.println(livro1);
        livro1.devolver();
        System.out.println("\n==== Informações do Livro 1 após devolução ====");
        System.out.println(livro1);

        System.out.println("\n==== Informações do Livro 2 ====");
        System.out.println(livro2);
        livro2.emprestar();
        System.out.println("\n==== Informações do Livro 2 após empréstimo ====");
        System.out.println(livro2);
        livro2.devolver();
        System.out.println("\n==== Informações do Livro 2 após devolução ====");
        System.out.println(livro2);
    }
}
