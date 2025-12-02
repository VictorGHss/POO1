package utfpr.exercicios.lista07.questao_prova;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Correntista correntista, String numAgencia, String numConta, String senha, double limite) {
        super(correntista, numAgencia, numConta, senha);
        this.limite = limite;
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
        if ((this.getSaldo() - valorSaque) >= -this.limite) {
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getLimite() {
        return limite;
    }
}
