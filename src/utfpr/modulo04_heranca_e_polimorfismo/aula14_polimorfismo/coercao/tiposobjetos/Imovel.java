package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.coercao.tiposobjetos;

public class Imovel {

    protected String endereco;
    protected double valorBase;

    public Imovel(String endereco, double valorBase) {

        this.endereco = endereco;
        this.valorBase = valorBase;
    }

    public Imovel() {
    }

    public void imprimirDados() {

        System.out.println("imprimir dados do Imovel");
    }

    public double calcularValor() {

        return 0.0;
    }
}
