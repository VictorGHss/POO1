package utfpr.exercicios.lista06.ex03;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valor;
    protected double ipva;

    public Veiculo(String marca, String modelo, int ano, double valor, double ipva) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.ipva = ipva;
    }

    public void calcularIpva() {
        this.ipva = calculoIpva();
        System.out.println("O valor do ipva do " + this.modelo + " é: " + this.ipva);
    }

    private double calculoIpva() {
        double ipvaTotal = valor * (ipva / 100.0);
        return ipvaTotal;
    }

    public void exibirDados() {
        System.out.println("=== Dados do Veículo ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
    }
}
