package utfpr.exercicios.lista04.ex03;

public class Conta {
    // Atributos
    private Long numConta;
    private Long numAgencia;
    private String senha;
    private Titular titular;
    private double saldo;

    // Construtor
    public Conta(Long numConta, Long numAgencia, String senha, Titular titular) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.senha = senha;
        this.titular = titular;
        this.saldo = 0;
    }

    //Métodos especificos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado com sucesso na conta de %s \n", valor, this.titular.getNome());
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso na conta de %s \n", valor, this.titular.getNome());
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido. O valor deve ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

    }

    public void checarSaldo() {
        System.out.printf("Saldo atual da conta de %s: R$ %.2f \n", this.titular.getNome(), saldo);
    }

    public void imprimirDados() {
        System.out.println("--- Dados da ContaBancaria ---");
        System.out.println("Número da ContaBancaria: " + numConta);
        System.out.println("Número da Agência: " + numAgencia);
        System.out.println("Saldo: " + saldo);
        titular.imprimirTitular();
    }


    // Getters e Setters
    public Long getNumConta() {
        return numConta;
    }

    public void setNumConta(Long numConta) {
        this.numConta = numConta;
    }

    public Long getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(Long numAgencia) {
        this.numAgencia = numAgencia;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
