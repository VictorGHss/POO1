package utfpr.fundamentos.exercicios.lista05.estacionamento;

public class Veiculos {
    private String modelo;
    private String placa;
    private String cor;
    private String nomeDono;
    private int horaEntrada;

    public Veiculos(String modelo, String placa, String cor, String nomeDono, int horaEntrada) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.nomeDono = nomeDono;
        this.horaEntrada = horaEntrada;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}
