package utfpr.exercicios.lista07.ex02;

public class CartaoCredito extends Pagamento {
    private int numCartao;
    private String titularCartao;
    private String dataValidade;
    private int cvv;

    public CartaoCredito(double valorCompra, int numCartao, String titularCartao, String dataValidade, int cvv) {
        super(valorCompra);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.println("Pagamento realizado com cartão de crédito!");
    }
}
