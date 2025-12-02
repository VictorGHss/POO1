package utfpr.exercicios.lista06.ex03;

public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double valor, double ipva, int capacidadeCarga) {
        super(marca, modelo, ano, valor, ipva);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void calcularIpva() {
        super.calcularIpva();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }
}
