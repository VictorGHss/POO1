package utfpr.exercicios.lista04.ex01;

public class Endereco {
    private String bairro;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;

    public Endereco(String bairro, String rua, int numero, String cidade, String estado) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void emitirEndereco(){
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Rua: " + this.rua);
        System.out.println("Numero: " + this.numero);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
