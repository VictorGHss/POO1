package utfpr.exercicios.lista07.ex04;

public class Endereco {
    protected String rua;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String cep;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}