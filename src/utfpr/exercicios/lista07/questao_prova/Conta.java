package utfpr.exercicios.lista07.questao_prova;

public abstract class Conta {
    private String numAgencia;
    private String numConta;
    private String senha;
    private double saldo;
    private Correntista correntista;

    public Conta(Correntista correntista, String numAgencia, String numConta, String senha) {
        this.correntista = correntista;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = 0.0;
    }

    protected boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public abstract void sacar(String numConta, String senha, double valorSaque);

    public void depositar(String numConta, String senha, double valorDeposito) {
        if (!this.numConta.equals(numConta)) {
            System.out.println("A conta informada não existe!");
            return;
        }
        if (!verificarSenha(senha)) {
            System.out.println("Senha incorreta!");
            return;
        }
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valorDeposito);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void verificarSaldo(String numConta, String senha) {
        if (!this.numConta.equals(numConta)) {
            System.out.println("A conta informada não existe!");
            return;
        }
        if (!verificarSenha(senha)) {
            System.out.println("Senha incorreta!");
            return;
        }
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }

    // Getters
    public String getNumAgencia() {
        return numAgencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }
    
    public Correntista getCorrentista() {
        return correntista;
    }

    // Setters
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}