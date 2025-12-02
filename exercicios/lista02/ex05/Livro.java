package utfpr.exercicios.lista02.ex05;

public class Livro {
    private String nomeAlunoEmprestimo;
    private String titulo;
    private String autor;
    private String editora;
    private int numPaginas;
    private int anoPublicacao;
    private boolean isDiponivel;

    public Livro(String titulo, String autor, String editora, int numPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
        this.anoPublicacao = anoPublicacao;
        this.isDiponivel = true;
        this.nomeAlunoEmprestimo = null;
    }

    public void realizarEmprestimo(String nomeAluno, String titulo) {
        if (this.titulo.equals(this.titulo)) {
            System.out.println(nomeAluno + " emprestou o livro " + titulo +
                    "\n---Informações do livro --- " +
                    "\nTitulo: " + titulo +
                    "\nAutor: " + this.autor +
                    "\nEditora: " + this.editora +
                    "\nNumero de páginas" + this.numPaginas +
                    "\nAno de Publicação: " + this.anoPublicacao +
                    "\n ==================================");
            isDiponivel = false;
            nomeAlunoEmprestimo = nomeAluno;
        } else {
            System.out.println("Informações incorretas, tente novamente.");
        }
    }

    public void realizarDevolucao(String nomeAluno, String titulo) {
        if (this.titulo.equals(this.titulo) && this.nomeAlunoEmprestimo.equals(this.nomeAlunoEmprestimo)) {

            System.out.println(nomeAluno + " devolveu o livro " + titulo +
                    "\n---Informações do livro --- " +
                    "\nTitulo: " + titulo +
                    "\nAutor: " + this.autor +
                    "\nEditora: " + this.editora +
                    "\nNumero de páginas" + this.numPaginas +
                    "\nAno de Publicação: " + this.anoPublicacao +
                    "\n ==================================");
            isDiponivel = true;
            nomeAlunoEmprestimo = null;
        } else {
            System.out.println("Informações incorretas, tente novamente.");
        }
    }

}
