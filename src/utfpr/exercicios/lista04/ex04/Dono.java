package utfpr.exercicios.lista04.ex04;

public class Dono {
    // Atributos
    private Animal animal;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;

    // Construtor
    public Dono(Animal animal, String nome, String cpf, String telefone, String email, Endereco endereco) {
        this.animal = animal;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Métodos específicos

    //Getters e Setters

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
