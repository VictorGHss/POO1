package utfpr.exercicios.lista04.ex03;

public class Titular {
    // Atributos
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String sexo;
    private double rendaMensal;
    private Endereco endereco;

    // Construtor
    public Titular(String nome, String cpf, String rg, String dataNascimento, String sexo, double rendaMensal, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rendaMensal = rendaMensal;
        this.endereco = endereco;
    }

    // Métodos especificos
    public void imprimirTitular(){
        System.out.println("--- Dados do Titular ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Renda Mensal: " + rendaMensal);
        endereco.imprimirEndereco();

    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
