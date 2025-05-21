package utfpr.fundamentos.revisao_array;

public class Produto {
    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private int qntdEstoque;
    private double precoUn;

    public Produto(int id, String nome, String marca, String modelo, int qntdEstoque, double precoUn) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.qntdEstoque = qntdEstoque;
        this.precoUn = precoUn;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }

    public double getPrecoUn() {
        return precoUn;
    }

    public void setPrecoUn(double precoUn) {
        this.precoUn = precoUn;
    }
}
