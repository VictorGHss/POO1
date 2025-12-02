package utfpr.exercicios.lista07.ex02;

public class PagamentoTeste {
    public static void main(String[] args) {
        System.out.println("=== Teste Cartão de Crédito ===");
        CartaoCredito cartao = new CartaoCredito(1.700, 1234567, "Victor", "23/12/2025", 123);
        cartao.realizarPagamento();

        System.out.println("=== Teste Pix ===");
        Pix pix = new Pix(1.700, "vitintrembala@gmail.com", "Victor");
        pix.realizarPagamento();

        System.out.println("=== Teste Boleto ===");
        Boleto boleto = new Boleto(1.700, "12/12/2025", 123456789);
        boleto.realizarPagamento();
    }
}
