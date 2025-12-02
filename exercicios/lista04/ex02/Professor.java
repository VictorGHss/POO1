package utfpr.exercicios.lista04.ex02;

public class Professor {
    private String nome;
    private String numMatricula;
    private String dataNascimento;
    private double salario;


    public Professor(String nome, String numMatricula, String dataNascimento, double salario) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("--- Dados do Professor ---");
        System.out.println("Nome do Professor: " + nome);
        System.out.println("Número de Matrícula: " + numMatricula);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: R$ " + salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
