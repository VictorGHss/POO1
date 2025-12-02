package utfpr.exercicios.lista03.ex01;

public class Funcionario {
    private int id;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    private String endereco;

    public Funcionario(int id, String nome, String dataNascimento, String sexo, String setor, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }


    public String emitirRelatorio() {
        return "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Sexo: " + sexo + "\n" +
               "Setor: " + setor + "\n" +
               "Telefone: " + telefone + "\n" +
               "Endereço: " + endereco;
    }
}