package utfpr.exercicios.lista06.ex03;

public class Carro extends Veiculo {
    private int qntdPortas;

    public Carro(String marca, String modelo, int ano, double valor, double ipva, int qntdPortas) {
        super(marca, modelo, ano, valor, ipva);
        this.qntdPortas = qntdPortas;
    }

    @Override
    public void calcularIpva() {
        super.calcularIpva();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Portas: " + qntdPortas);
    }
}
