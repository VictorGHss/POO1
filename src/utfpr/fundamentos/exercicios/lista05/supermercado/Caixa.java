package utfpr.fundamentos.exercicios.lista05.supermercado;

public class Caixa {
    private Cliente caixa1 = null;
    private Cliente caixa2 = null;
    private Cliente caixa3 = null;

    public void atenderCliente(String nome, int numPedido, int horaChegada) {
        if (caixa1 == null) {
            caixa1 = new Cliente(nome, numPedido, horaChegada);
            System.out.println("Cliente " + nome + " está sendo atendido no caixa 1");
        } else if (caixa2 == null) {
            caixa2 = new Cliente(nome, numPedido, horaChegada);
            System.out.println("Cliente " + nome + " está sendo atendido no caixa 2");
        } else if (caixa3 == null) {
            caixa3 = new Cliente(nome, numPedido, horaChegada);
            System.out.println("Cliente " + nome + " está sendo atendido no caixa 3");
        } else {
            System.out.println("Todos os caixas estão ocupados, aguarde na fila.");
        }
    }

    public double calcularEspera(int horaEntrada, int horaSaida) {
        int minutosEspera = horaSaida - horaEntrada;
        return minutosEspera * 0.10;
    }

    public void finalizarAtendimento(int numeroPedido, int horaSaida) {
        boolean encontrado = false;

        if (caixa1 != null && caixa1.getNumPedido() == numeroPedido) {
            double custo = calcularEspera(caixa1.getHoraChegada(), horaSaida);
            System.out.println("Cliente retirado do caixa 1. Custo: R$" + custo);
            caixa1 = null;
            encontrado = true;
        } else if (caixa2 != null && caixa2.getNumPedido() == numeroPedido) {
            double custo = calcularEspera(caixa2.getHoraChegada(), horaSaida);
            System.out.println("Cliente retirado do caixa 2. Custo: R$" + custo);
            caixa2 = null;
            encontrado = true;
        } else if (caixa3 != null && caixa3.getNumPedido() == numeroPedido) {
            double custo = calcularEspera(caixa3.getHoraChegada(), horaSaida);
            System.out.println("Cliente retirado do caixa 3. Custo: R$" + custo);
            caixa3 = null;
            encontrado = true;
        }

        if (!encontrado) {
            System.out.println("Cliente com pedido " + numeroPedido + " não encontrado.");
        }
    }
}