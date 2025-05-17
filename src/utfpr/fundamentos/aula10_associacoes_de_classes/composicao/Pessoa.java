package utfpr.fundamentos.aula10_associacoes_de_classes.composicao;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, String rua, String cidade, String cep) {
        this.nome = nome;
        // Composição: o endereço é criado junto com a pessoa
        this.endereco = new Endereco(rua, cidade, cep);
    }

    public String getNome() {
        return nome;
    }

    public String getEnderecoCompleto() {
        return endereco.toString();
    }

    @Override
    public String toString() {
        return nome + " mora em " + endereco;
    }
}

