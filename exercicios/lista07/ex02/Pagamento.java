package utfpr.exercicios.lista07.ex02;

public class Pagamento {
    protected double valorCompra;

    public Pagamento(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarPagamento(){
        System.out.println("Valor da compra: " + this.valorCompra);
    }
}
