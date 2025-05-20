package utfpr.fundamentos.aula11_enumeracoes.exercicio2;

public class Cliente {
    private Integer id;
    private String nome;
    private String dataNascimento;
    private EstadoCivil estadoCivil;

    public Cliente(Integer id, String nome, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = EstadoCivil.SOLTEIRO;
    }

    public void exibirCliente(){
        System.out.println("ID do cliente: " + this.id);
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Estado civil: " + this.estadoCivil);
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
