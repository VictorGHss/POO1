package utfpr.fundamentos.aula13_heranca.exemplo1;

public class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected String combustivel;
    protected int ano;
    protected int numPassageiros;

    public Veiculo(String modelo, String fabricante, String combustivel, int ano, int numPassageiros) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.ano = ano;
        this.numPassageiros = numPassageiros;
    }

    public Veiculo() {
    }

    public void abastecer() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
