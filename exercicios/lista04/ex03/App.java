package utfpr.exercicios.lista04.ex03;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(123453L, 1234L, "SenhaForte", new Titular("Victor Gabriel", "138.210.259-30", "12.345.678-9", "26-10-2004", "Masculino", 5000.00, new Endereco("Rua Cornélio Procópio", 123, "Capão Redondo", "São Paulo", "SP")));
        conta.imprimirDados();
        conta.depositar(1000.00);
        conta.checarSaldo();
        conta.sacar(500.00);
        conta.checarSaldo();
        conta.sacar(6000.00); // Tentativa de saque com saldo insuficiente
        conta.sacar(-100.00); // Tentativa de saque com valor inválido
    }
}
