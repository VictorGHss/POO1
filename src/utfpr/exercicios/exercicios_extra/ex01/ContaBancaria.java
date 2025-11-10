package utfpr.exercicios.exercicios_extra.ex01;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    private String nomeTitular;
    private TipoConta tipoConta;

    public ContaBancaria(String nomeTitular, int numConta, TipoConta tipoConta) {
        this.numConta = numConta;
        this.saldo = 0;
        this.nomeTitular = nomeTitular;
        this.tipoConta = tipoConta;
    }

    public void Depositar(String nomeTitular, int numConta, double valor) {
        if (this.nomeTitular.equals(this.nomeTitular) && this.numConta == numConta) {
            setSaldo(saldo += valor);
            System.out.println("Deposito de " + valor + " realizado com sucesso por " + nomeTitular + "!!");
            verificarSaldo(nomeTitular, numConta);
        } else {
            System.out.println("Dados da conta incorretos, tente novamente. ");
        }
    }

    public void sacar(String nomeTitular, int numConta, double valor) {
        if (this.nomeTitular.equals(this.nomeTitular) && this.numConta == numConta) {
            setSaldo(saldo -= valor);
            if (getSaldo() >= valor) {
                System.out.println("Saque de " + valor + " realizado com sucesso por " + nomeTitular + "!!");
                verificarSaldo(nomeTitular, numConta);
            } else {
                System.out.println("Você está com saldo negativo na conta " + numConta
                        + ", realize um deposito e tente novamente.");
            }
        } else {
            System.out.println("Dados da conta incorretos, tente novamente. ");
        }
    }

    public void verificarSaldo(String nomeTitular, int numConta) {
        if (this.nomeTitular.equals(this.nomeTitular) && this.numConta == numConta) {
            System.out.println("Saldo atual da conta: R$ " + getSaldo());
        } else {
            System.out.println("Dados da conta incorretos, tente novamente. ");
        }
    }

    public void imprimirDados() {
        System.out.println("--- Dados da Conta ---");
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Numero da conta" + this.numConta);
        System.out.println("Saldo atual na da conta " + getSaldo());
        System.out.println("=================================");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
