package utfpr.fundamentos.aula06_variaveis.exercicioclasses;

public class Conta {
    String nomeTitular;
    int numConta;
    double saldo;
    static int contadorContas = 0;

    public Conta(String nomeTitular, double saldoInicial) {
        nomeTitular = nomeTitular;
        saldo = saldoInicial;
        numConta = ++contadorContas; // Incrementa e atribui o número da conta
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }
}
