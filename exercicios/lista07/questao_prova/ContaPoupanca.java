package utfpr.exercicios.lista07.questao_prova;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(Correntista correntista, String numAgencia, String numConta, String senha, double rendimento) {
        super(correntista, numAgencia, numConta, senha);
        this.rendimento = rendimento;
    }

    @Override
    public void depositar(String numConta, String senha, double valorDeposito) {
        if (!this.getNumConta().equals(numConta)) {
            System.out.println("A conta informada não existe!");
            return;
        }
        if (!verificarSenha(senha)) {
            System.out.println("Senha incorreta!");
            return;
        }
        if (valorDeposito > 0) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valorDeposito);

            // Aplicar rendimento imediatamente após o depósito
            double valorRendimento = valorDeposito * this.rendimento;
            this.setSaldo(this.getSaldo() + valorRendimento);
            System.out.printf("Rendimento de R$ %.2f aplicado com sucesso!%n", valorRendimento);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    @Override
    public void sacar(String numConta, String senha, double valorSaque) {
        if (!this.getNumConta().equals(numConta)) {
            System.out.println("A conta informada não existe!");
            return;
        }
        if (!verificarSenha(senha)) {
            System.out.println("Senha incorreta!");
            return;
        }
        if (this.getSaldo() >= valorSaque) {
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void aplicarRendimento() {
        double valorRendimento = this.getSaldo() * this.rendimento;
        this.setSaldo(this.getSaldo() + valorRendimento);
        System.out.printf("Rendimento de R$ %.2f aplicado com sucesso!%n", valorRendimento);
    }

    public double getRendimento() {
        return rendimento;
    }
}
