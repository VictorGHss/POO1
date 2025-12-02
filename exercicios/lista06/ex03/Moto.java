package utfpr.exercicios.lista06.ex03;

public class Moto extends Veiculo {
    private String tipoQuidao;

    public Moto(String marca, String modelo, int ano, double valor, double ipva, String tipoQuidao) {
        super(marca, modelo, ano, valor, ipva);
        this.tipoQuidao = tipoQuidao;
    }

    @Override
    public void calcularIpva() {
        super.calcularIpva();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Quidão: " + tipoQuidao);
    }
}
