package utfpr.modulo04_heranca_e_polimorfismo.aula17_interface;

public class CarrinhoCompraTeste {

    public static void main(String[] args) {

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra(150.00, 100, new Correios());
        carrinhoCompra.finalizarCompra();
    }
}
