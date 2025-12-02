package utfpr.exercicios.lista02.ex02;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    public void emprestar(){
        if(disponivel){
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Livro já está disponível.");
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", numeroPaginas=" + numeroPaginas +
                ", disponivel=" + disponivel +
                '}';
    }
}
