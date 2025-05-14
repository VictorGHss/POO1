package utfpr.fundamentos.aula12_arraylist.ContaBancaria;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    private String nomeTitular;

    public int getNumConta() {
        return numConta;
    }

    public ContaBancaria(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.saldo = 0.00;
        this.nomeTitular = nomeTitular;
    }

    public void realizarSaque(Double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente. kkk pobre");
        }
    }

    public void depositar(Double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor invalido.");
        }
    }

    public void imprimirSaldo() {
        System.out.println("===== LascadoBank =====");
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Número da conta " + this.numConta);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("====================");
    }
}
