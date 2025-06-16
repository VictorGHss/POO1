package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.associacao_binaria;

import java.util.Random;

public class ContratoAluguel {
    private int numContrato;
    private double valor;
    private String nomeCliente;
    private int dataLocacao;
    private int dataDevolucao;
    private Veiculo veiculo;

    public ContratoAluguel(int numContrato, double valor, String nomeCliente, int dataLocacao, int dataDevolucao, Veiculo veiculo) {
        this.numContrato = numContrato;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.veiculo = veiculo;
    }

    public void alugarVeiculo() {
        if (veiculo != null && veiculo.isDisponivel()) {
            this.numContrato = new Random().nextInt(1000, 9999);
            veiculo.setDisponivel(false);
            veiculo.setContratoAluguel(this);
            System.out.println("Número do contrato: " + this.numContrato);
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " com a placa " + veiculo.getPlaca() + 
                ", foi alugado por " + nomeCliente + " no dia " + dataLocacao + ".\n" + 
                "Valor da diária: " + veiculo.getValorDiaria());
        } else {
            System.out.println("Não foi possível alugar o veículo. Verifique se ele está disponível.");
        }
    }

    public double calcularCustos() {
        if (veiculo == null) {
            return 0;
        }

        int diasAluguel = dataDevolucao - dataLocacao;
        if (diasAluguel <= 0) {
            diasAluguel = 1;
        }

        return diasAluguel * veiculo.getValorDiaria();
    }

    public void devolverVeiculo(int dataDevolucao) {
        if (veiculo != null && !veiculo.isDisponivel()) {
            this.dataDevolucao = dataDevolucao;
            veiculo.setDisponivel(true);
            double valorTotal = calcularCustos();

            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " com a placa " + veiculo.getPlaca() + 
                ", foi devolvido por " + nomeCliente + " no dia " + dataDevolucao);
            System.out.println("Valor total do aluguel: R$ " + valorTotal);

            veiculo.setContratoAluguel(null);
        } else {
            System.out.println("Não foi possível devolver o veículo. Verifique se ele está alugado.");
        }
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(int dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
