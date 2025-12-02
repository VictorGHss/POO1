package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.exercicio.cadastro;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String estadoCivil;
    private Endereco endereco;

    public Pessoa(String nome, String dataNascimento, String sexo, String estadoCivil, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Estado civil: " + getEstadoCivil());
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumCasa() + ", " + endereco.getCep() + ", " + endereco.getCidade() + ", " + endereco.getEstado());
    }
}
