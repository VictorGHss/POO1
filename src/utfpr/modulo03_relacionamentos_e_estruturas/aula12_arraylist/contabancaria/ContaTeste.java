package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist.contabancaria;

public class ContaTeste {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(106891, "Victor");
        c1.imprimirDados();

        c1.realizarDeposito(500.0);

        c1.realizarSaque(200.0);

        c1.imprimirDados();
    }
}
