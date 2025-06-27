package utfpr.exercicios.lista07.questao_prova;

public class App {
    public static void main(String[] args) {
        // Criar correntistas
        Correntista victor = new Correntista("Victor");
        Correntista joslaine = new Correntista("Joslaine");

        // Criar contas
        ContaCorrente contaCorrente = new ContaCorrente(victor, "0000-11", "31254-5", "10262004", 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(joslaine, "0000-15", "12891-4", "30145241", 0.10);

        // Adicionar contas aos correntistas
        victor.adicionarConta(contaCorrente);
        joslaine.adicionarConta(contaPoupanca);

        System.out.println("Realizando deposito na conta corrente");
        contaCorrente.depositar("31254-5", "10262004", 1000.00);
        System.out.println("========================");

        System.out.println("Realizando saque na conta corrente");
        contaCorrente.sacar("31254-5", "10262004", 1000.00);
        System.out.println("========================");

        System.out.println("Verificando saldo na conta corrente");
        contaCorrente.verificarSaldo("31254-5", "10262004");
        System.out.println("========================");

        System.out.println("Testando o limite da conta corrente");
        System.out.println("Tentando sacar R$ 500,00 com saldo zero (usando o limite)");
        contaCorrente.sacar("31254-5", "10262004", 500.00);
        contaCorrente.verificarSaldo("31254-5", "10262004");
        System.out.println("========================");

        System.out.println("Tentando sacar mais R$ 600,00 (excederia o limite de R$ 1000,00)");
        contaCorrente.sacar("31254-5", "10262004", 600.00);
        contaCorrente.verificarSaldo("31254-5", "10262004");
        System.out.println("========================");

        System.out.println("Realizando deposito na conta poupança");
        contaPoupanca.depositar("12891-4", "30145241", 1000.00);
        System.out.println("========================");

        System.out.println("Realizando saque na conta poupança");
        contaPoupanca.sacar("12891-4", "30145241", 500.00);
        System.out.println("========================");

        System.out.println("Verificando saldo na conta poupança");
        contaPoupanca.verificarSaldo("12891-4", "30145241");
        System.out.println("========================");

        // Nota: O rendimento já é aplicado automaticamente durante o depósito
        // Esta chamada é apenas para demonstrar o método aplicarRendimento() separadamente
        System.out.println("Aplicando rendimento adicional na conta poupança");
        contaPoupanca.aplicarRendimento();
        contaPoupanca.verificarSaldo("12891-4", "30145241");
    }
}
