package utfpr.exercicios.lista04.ex03;

public class Endereco {
    // Atributos
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    // Construtor
    public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Métodos especificos
    public void imprimirEndereco() {
        System.out.println("--- Endereço ---");
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
