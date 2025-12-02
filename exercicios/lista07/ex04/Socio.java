package utfpr.exercicios.lista07.ex04;

public class Socio extends Cliente {
    private String cpf;
    private Dependente dependente;

    public Socio(String rua, String bairro, String cidade, String estado, String cep, String nome, String dataNascimento, String telefone, Endereco endereco, String cpf, Dependente dependente) {
        super(rua, bairro, cidade, estado, cep, nome, dataNascimento, telefone, endereco);
        this.cpf = cpf;
        this.dependente = dependente;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
