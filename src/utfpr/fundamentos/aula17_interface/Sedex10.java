package utfpr.fundamentos.aula17_interface;

public class Sedex10 implements Frete {

    @Override
    public double calcularFrete(int distancia) {

        return 19.00 + (distancia * 0.55);
    }
}
