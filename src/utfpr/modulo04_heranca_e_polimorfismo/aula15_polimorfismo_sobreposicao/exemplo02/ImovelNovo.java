package utfpr.modulo04_heranca_e_polimorfismo.aula15_polimorfismo_sobreposicao.exemplo02;

public class ImovelNovo extends Imovel {

    private double valorAdicional;

    public ImovelNovo(String endereco, double valorBase, double valorAdicional) {

        super(endereco, valorBase);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirDados() {

        super.imprimirDados();
        System.out.println("Valor Adicional: R$" + this.valorAdicional);
        System.out.println("Valor Total: R$" + this.calcularValorImovel());
    }

    @Override
    protected double calcularValorImovel() {

        return this.valorBase + this.valorAdicional;
    }
}
