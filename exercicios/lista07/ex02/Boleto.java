package utfpr.exercicios.lista07.ex02;

public class Boleto extends Pagamento{
    private String dataVencimento;
    private int codBarras;

    public Boleto(double valorCompra, String dataVencimento, int codBarras) {
        super(valorCompra);
        this.dataVencimento = dataVencimento;
        this.codBarras = codBarras;
    }

    @Override
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.println("Pagamento realizado com boleto!");
    }
}
