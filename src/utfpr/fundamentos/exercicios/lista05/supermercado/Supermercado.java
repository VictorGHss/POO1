package utfpr.fundamentos.exercicios.lista05.supermercado;

public class Supermercado {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        // Atender clientes e ocupar todos os caixas
        caixa.atenderCliente("Victor", 115, 12);
        caixa.atenderCliente("Julia", 116, 12);
        caixa.atenderCliente("Rafael", 117, 12);

        // Deixar cliente na fila
        caixa.atenderCliente("Fernanda", 130, 12);

        // Finalizar um atendimento
        caixa.finalizarAtendimento(115, 14);

        // Finalizar um pedido inexistente
        caixa.finalizarAtendimento(124, 17);

    }
}
