package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.associacao_binaria;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    private double valorDiaria;
    private boolean disponivel;
    ContratoAluguel contratoAluguel;

    public Veiculo(String modelo, String marca, int ano, String placa, double valorDiaria) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public ContratoAluguel getContratoAluguel() {
        return contratoAluguel;
    }

    public void setContratoAluguel(ContratoAluguel contratoAluguel) {
        this.contratoAluguel = contratoAluguel;
    }
}
