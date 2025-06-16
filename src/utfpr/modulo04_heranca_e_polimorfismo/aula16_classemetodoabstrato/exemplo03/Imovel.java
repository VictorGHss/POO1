package utfpr.modulo04_heranca_e_polimorfismo.aula16_classemetodoabstrato.exemplo03;

public abstract class Imovel {

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

    protected abstract double calcularValorImovel();
}
