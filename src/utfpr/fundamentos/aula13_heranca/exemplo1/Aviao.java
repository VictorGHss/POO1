package utfpr.fundamentos.aula13_heranca.exemplo1;

public class Aviao extends Veiculo {
    private int altitudeMaxima;

    public Aviao(String modelo, String fabricante, String combustivel, int ano, int numPassageiros, int altitudeMaxima) {
        super(modelo, fabricante, combustivel, ano, numPassageiros);
        this.altitudeMaxima = altitudeMaxima;
    }

    public void voar() {
        System.out.println(this.getModelo() + " está voando a uma altitude de " + altitudeMaxima + " metros.");
    }

    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }
}
