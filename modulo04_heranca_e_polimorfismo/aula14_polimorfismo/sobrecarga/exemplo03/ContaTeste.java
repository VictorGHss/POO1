package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.sobrecarga.exemplo03;

public class ContaTeste {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.emitirSaldo();

        Conta conta2 = new Conta(1000.00);
        conta2.emitirSaldo();
    }
}
