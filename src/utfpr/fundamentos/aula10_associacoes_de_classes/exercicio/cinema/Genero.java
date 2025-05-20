package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

import java.util.ArrayList;
import java.util.List;

public class Genero implements TemplateCinema{
    private String descricao;

    public Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void editar() {
        System.out.println("Gênero '" + descricao + "' editado!");
    }

    @Override
    public void remover() {
        System.out.println("Gênero '" + descricao + "' removido!");
    }

    @Override
    public void cadastrar() {
        System.out.println("Gênero '" + descricao + "' cadastrado!");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando filmes do gênero '" + descricao + "'");
    }

    @Override
    public String toString() {
        return "Genero{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
