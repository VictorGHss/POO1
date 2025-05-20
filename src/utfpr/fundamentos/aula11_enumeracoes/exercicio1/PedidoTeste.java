package utfpr.fundamentos.aula11_enumeracoes.exercicio1;

public class PedidoTeste {
    public static void main(String[] args) {

        Pedido pediddy1 = new Pedido(1, "20/05/2025");
        pediddy1.mostrarPedido();

        System.out.println("------------------------------");
        pediddy1.setStatus(Status.PROCESSANDO);
        pediddy1.mostrarPedido();

        System.out.println("------------------------------");
        pediddy1.setStatus(Status.ENVIADO);
        pediddy1.mostrarPedido();

        System.out.println("------------------------------");
        pediddy1.setStatus(Status.ENTREGUE);
        pediddy1.mostrarPedido();

    }
}
