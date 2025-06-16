package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist.contabancaria_array;

public class ContaBancaria {
    private Integer numConta;
    private String nomeTitular;
    private Double saldo;

    public ContaBancaria(Integer numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void verificarSaldo(Double saldo) {
        System.out.println("Verificando saldo...");
        System.out.println("Conta: " + this.getNumConta() + " | Saldo: " + this.getSaldo() + "\n");
    }

    public void realizarDeposito(Double valor) {
        System.out.println("Digite o valor a ser depositado:");
        this.saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("Saldo atual: " + this.getSaldo() + "\n");
    }

    public void realizarSaque(Double valor) {
        System.out.println("Digite o valor que deseja sacar: ");
        this.saldo -= valor;
        System.out.println("Valor sacado: " + valor);
        System.out.println("Saldo após o saque: " + this.getSaldo() + "\n");
    }

    public void imprimirDados() {
        System.out.println("----- BCTBank -----");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Nome do titular: " + this.getNomeTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("-------------------");
    }
}