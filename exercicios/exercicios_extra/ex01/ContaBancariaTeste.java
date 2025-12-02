package utfpr.exercicios.exercicios_extra.ex01;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        System.out.println("🏦 === SISTEMA BANCÁRIO ===\n");
        
        // Criando conta corrente
        ContaBancaria contaCorrente = new ContaBancaria("Victor Gabriel", 1010, TipoConta.CORRENTE);
        contaCorrente.imprimirDados();
        
        // Criando conta poupança
        ContaBancaria contaPoupanca = new ContaBancaria("Ana Silva", 2020, TipoConta.POUPANCA);
        contaPoupanca.imprimirDados();

        contaCorrente.Depositar("Victor Gabriel", 1010, 500);

        contaCorrente.sacar("Victor Gabriel", 1010, 550);

        
        
        System.out.println("\n--- DADOS FINAIS ---");
        contaCorrente.imprimirDados();
        contaPoupanca.imprimirDados();
    }
}
