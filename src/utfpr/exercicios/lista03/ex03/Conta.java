package utfpr.exercicios.lista03.ex03;

public class Conta {
    private String numAgencia;
    private String numConta;
    private double saldo;

    public Conta(String numAgencia, String numConta) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso na conta %s! \n", valor, numConta);
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso na conta %s! \n", valor, numConta);
            System.out.printf("Saldo atual: R$ %.2f \n", saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void verificaSaldo(){
        System.out.printf("Saldo atual da conta %s: R$ %.2f \n", numConta, saldo);
    }

    public void imprimirDados(){
        System.out.println("=== Dados da ContaBancaria ===");
        System.out.println("Agência: " + numAgencia);
        System.out.println("ContaBancaria: " + numConta);
        System.out.printf("Saldo: R$ %.2f \n", saldo);
    }
}
