package utfpr.fundamentos.revisao_array;

import java.util.List;
import java.util.ArrayList;

public class Loja {
    private String cnpj;
    private String razaoSocial;
    private List<Produto> prod;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.prod = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, String marca, String modelo, int qntdEstoque, double precoUn) {
        Produto p = new Produto(id, nome, marca, modelo, 0, 0);
        this.prod.add(p);
        System.out.println("Produto " + nome + " adicionado com sucesso!");
    }

    public void adquirirProduto(int id, String nome, String marca, String modelo, int qntdEstoque, double precoUn) {
        for (Produto p : this.prod) {
            if (p.getNome().equals(nome)) {
                System.out.println("Produto " + nome + " já existe, quantidade atual:" + p.getQntdEstoque());
                return;
            }
        }
        System.out.println("Produto " + nome + " adicionado com sucesso!");
    }

    public void listarProdutos(){
        for (Produto p : this.prod) {
            System.out.println(p.getNome());
        }
    }

    public void 

}


