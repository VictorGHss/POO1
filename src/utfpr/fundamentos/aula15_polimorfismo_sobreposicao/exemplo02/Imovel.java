package utfpr.fundamentos.aula15_polimorfismo_sobreposicao.exemplo02;

public class Imovel {

    protected String endereco;
    protected double valorBase;

    public Imovel(String endereco, double valorBase) {

        this.endereco = endereco;
        this.valorBase = valorBase;
    }

    public void imprimirDados() {

        System.out.println("Endereço: " + this.endereco);
        System.out.println("Valor Base: R$" + this.valorBase);
    }

    protected double calcularValorImovel() {

        return 0.0;
    }
}
