package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.sobrecarga.exemplo04;

public class Conversor {
    public int converterValor(long valor) {

        return (int) valor;
    }

    public int converterValor(float valor) {

        return (int) valor;
    }

    public int converterValor(double valor) {

        return (int) valor;
    }

    public int converterValor(String valor) {

        return Integer.parseInt(valor);
    }
}
