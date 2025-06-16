package utfpr.fundamentos.aula17_interface;

public class Correios implements Frete {

    @Override
    public double calcularFrete(int distancia) {

        return 15.00 + (0.30 * distancia);
    }
}
