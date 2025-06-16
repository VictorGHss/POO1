package utfpr.modulo04_heranca_e_polimorfismo.aula13_heranca.exemplo1;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String modelo, String fabricante, String combustivel, int ano, int numPassageiros, int numPortas) {
        super(modelo, fabricante, combustivel, ano, numPassageiros);
        this.numPortas = numPortas;
    }

    public void calibrarPneus() {
        System.out.println("Calibrando os pneus do " + getModelo() + ".");
    }

    public int getNumPortas() {
        return numPortas;
    }

}
