package utfpr.exercicios.lista07.ex02;

public class Pix extends Pagamento{
    private String chavePix;
    private String nomeDestinatario;

    public Pix(double valorCompra, String chavePix, String nomeDestinatario) {
        super(valorCompra);
        this.chavePix = chavePix;
        this.nomeDestinatario = nomeDestinatario;
    }

    @Override
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.println("Pagamento realizado com Pix! Chave: " + chavePix + "\nDestinatário: " + nomeDestinatario);
    }
}
