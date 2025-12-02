package utfpr.exercicios.lista03.ex03;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1234", "56789-0");
        Conta conta2 = new Conta("9876", "54321-0");

        System.out.println("==== Teste da ContaBancaria 1 ====");
        conta1.imprimirDados();
        conta1.depositar(500);
        conta1.verificaSaldo();
        conta1.sacar(200);
        conta1.verificaSaldo();
        conta1.sacar(1000); // Saque acima do saldo

        System.out.println("\n==== Teste da ContaBancaria 2 ====");
        conta2.imprimirDados();
        conta2.depositar(1000);
        conta2.verificaSaldo();
        conta2.sacar(300);
        conta2.verificaSaldo();
        conta2.sacar(800); // Saque acima do saldo

    }
}
