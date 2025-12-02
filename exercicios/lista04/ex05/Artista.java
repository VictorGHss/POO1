package utfpr.exercicios.lista04.ex05;

public class Artista {
    //Atributos
    private String nome;
    private String genero;
    private String descricao;

    //Construtor
    public Artista(String nome, String genero, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
