package utfpr.fundamentos.aula06.exercicioclasses;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Victor", 1000.0);
        Conta conta2 = new Conta("Joslaine", 2000.0);
        Conta conta3 = new Conta("Carlinhos", 1500.0);

        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        conta3.exibirInformacoes();
    }
}
