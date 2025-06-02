package utfpr.fundamentos.revisao_array;

public class LojaTeste {
    public static void main(String[] args) {
        Loja loja = new Loja("12345679", "Boteco do Gerson");

        loja.adicionarProduto(1, "Cerveja", "Skol", "Lata", 100, 3.50);
        loja.adicionarProduto(2, "Cerveja", "Brahma", "Lata", 50, 3.00);

        loja.listarProdutos();

        loja.adquirirProduto(1, "Cerveja", "Skol", "Lata", 20, 3.50);

        loja.adicionarProduto(3, "Cerveja", "Skol", "Lata", 10, 3.50);
        loja.listarProdutos();

        loja.adquirirProduto(4, "Refrigerante", "Coca-Cola", "Lata", 30, 5.00);
        loja.listarProdutos();

        loja.adquirirProduto(1, "Cerveja", "Skol", "Lata", 0, 3.50);
        loja.listarProdutos();

        loja.adquirirProduto(1, "Cerveja", "Skol", "Lata", -5, 3.50);
        loja.listarProdutos();
    }
}
