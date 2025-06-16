package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.exercicio.cadastro;

public class Endereco {
    private String rua;
    private String numCasa;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numCasa, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numCasa = numCasa;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + ", Número: " + numCasa + ", CEP: " + cep + ", Cidade: " + cidade + ", Estado: " + estado;
    }
}
