package utfpr.exercicios.lista07.ex04;

public abstract class Cliente extends Endereco {
    protected String nome;
    protected String dataNascimento;
    protected String telefone;
    protected Endereco endereco;

    public Cliente(String rua, String bairro, String cidade, String estado, String cep, String nome, String dataNascimento, String telefone, Endereco endereco) {
        super(rua, bairro, cidade, estado, cep);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
