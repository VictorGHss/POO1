package utfpr.exercicios.lista04.ex01;

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    Endereco endereco;

    public Funcionario(String nome, String dataNascimento, String sexo, String setor, String telefone, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void emitirRelatorio(){
        System.out.println("Relatorio do funcionario");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Setor: " + setor);
        System.out.println("Telefone: " + telefone);
        endereco.emitirEndereco();
    }

    public void cadastrarFuncionario(){
    }

    public void atualizarFuncionario(){

    }

    public void excluirFuncionario(){

    }

    public void listarFuncionarios(){

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
