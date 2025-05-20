package utfpr.fundamentos.aula11_enumeracoes.exercicio1;

public class Pedido {
    private Integer id;
    private String data;
    private Status statusPedido;

    public Pedido(Integer id, String data) {
        this.id = id;
        this.data = data;
        this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
    }

    public void mostrarPedido(){
        System.out.println("Código: " + this.id);
        System.out.println("Data: " + this.data);
        System.out.println("Status: " + this.statusPedido);
    }

    public void setStatus(Status statusPedido) {
        this.statusPedido = statusPedido;
    }
}
