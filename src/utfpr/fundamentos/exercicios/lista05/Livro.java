package utfpr.fundamentos.exercicios.lista05;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPub;
    private int numPag;

    private boolean disponivel;
    private int diaEmprestimo;

    public Livro(String titulo, String autor, String editora, int anoPub, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPub = anoPub;
        this.numPag = numPag;
        this.disponivel = true;
    }

    public boolean emprestar(int diaAtual, String nomeAluno) {
        if (disponivel) {
            disponivel = false;
            diaEmprestimo = diaAtual;
            System.out.println("O livro: " + titulo + " foi emprestado pelo aluno " + nomeAluno + " no dia " + diaAtual);
            return true;
        } else {
            System.out.println("Livro '" + titulo + "' já está emprestado.");
            return false;
        }
    }

    public double devolver(int diaDevolucao) {
        if (!disponivel) {
            int diasComLivro = diaDevolucao - diaEmprestimo;
            double multa = 0;

            if (diasComLivro > 7) {
                int diasAtraso = diasComLivro - 7;
                multa = diasAtraso * 1.50;
            }
            disponivel = true;
            System.out.println("Livro '" + titulo + "' devolvido no dia " + diaDevolucao);
            System.out.println("Tempo com o livro: " + diasComLivro + " dias");
            System.out.println("Multa a pagar: R$" + multa);

            return multa;
        } else {
            System.out.println("Livro '" + titulo + "' já está disponível.");
            return 0;
        }
    }

    public void imprimirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de Publicação: " + anoPub);
        System.out.println("Número de páginas: " + numPag);
        System.out.println("Disponível? " + (disponivel ? "Sim" : "Não"));
    }
}