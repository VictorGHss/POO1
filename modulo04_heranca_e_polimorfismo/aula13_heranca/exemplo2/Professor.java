package utfpr.modulo04_heranca_e_polimorfismo.aula13_heranca.exemplo2;

public class Professor {
    protected Integer numRegistro;
    protected String nome;
    protected String dataNomeacao;
    protected Double salario;

    public Professor(Integer numRegistro, String nome, String dataNomeacao, Double salario) {
        this.numRegistro = numRegistro;
        this.nome = nome;
        this.dataNomeacao = dataNomeacao;
        this.salario = salario;
    }

    public void lancarFrequencia(){
        System.out.println(this.nome + " está lançando a frequência dos alunos.");
    }

    public void aplicarAvaliacao(){
        System.out.println(this.nome + " está aplicando uma avaliação.");
    }

    public void imprimirDadosProfessor(){
        System.out.println("Número de Registro: " + this.numRegistro);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nomeação: " + this.dataNomeacao);
        System.out.println("Salário: " + this.salario);
        System.out.println("-------------------------------");
    }
}
