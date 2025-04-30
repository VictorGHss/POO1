package utfpr.fundamentos.exercicios.lista05.estacionamento;

public class Estacionamento {
    private final Veiculos[] vagas = new Veiculos[5];

    public void estacionar(String modelo, String placa, String cor, String nomeDono, int horaEntrada) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = new Veiculos(modelo, placa, cor, nomeDono, horaEntrada);
                System.out.println(vagas[i].getModelo() + " estacionado na vaga " + (i + 1) + ".");
                return;
            }
        }
        System.out.println("Estacionamento lotado!");
    }

    public void retirar(String placa, int horaSaida) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
                double custo = calcularCusto(vagas[i].getHoraEntrada(), horaSaida);
                System.out.println(vagas[i].getModelo() + " retirado da vaga " + (i + 1) + ". Custo: R$ " + custo);
                vagas[i] = null;
                return;
            }
        }
        System.out.println("Veiculo com placa " + placa + " não encontrado.");
    }

    private double calcularCusto(int horaEntrada, int horaSaida) {
        int horasPermanencia = horaSaida - horaEntrada;
        if (horasPermanencia <= 3) {
            return 2.0;
        } else {
            return 2.0 + (horasPermanencia - 3) * 0.5;
        }
    }
}