package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

import java.util.List;
import java.util.ArrayList;

public class Filme implements TemplateCinema{
    private String titulo;
    private int duracao;
    private List<Ator> atores;
    private List <Genero> generos;

    public Filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.atores = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public void adicionarAtor(Ator ator){
        this.atores.add(ator);
    }

    public void removerAtor(Ator ator){
        this.atores.remove(ator);
    }

    public List <Genero> getGeneros(){
        return generos;
    }

    public void adicionarGenero(Genero genero){
        this.generos.add(genero);
    }

    public void removerGenero(Genero genero){
        this.generos.remove(genero);
    }

    @Override
    public void cadastrar() {
        System.out.println("Filme '" + titulo + "' cadastrado.");
    }

    @Override
    public void editar() {
        System.out.println("Filme '" + titulo + "' editado.");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando filme '" + titulo + "'.");
    }

    @Override
    public void remover() {
        System.out.println("Filme '" + titulo + "' removido.");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao + " min" +
                ", atores=" + atores +
                ", generos=" + generos +
                '}';
    }
}
