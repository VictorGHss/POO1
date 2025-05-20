package utfpr.fundamentos.aula12_arraylist.contabancaria_array;

public class BancoTeste {
    public static void main(String[] args) {
        Banco banco1 = new Banco("123456789", "BCTBank");

        banco1.criarNovaConta(111, "Victor");
        banco1.criarNovaConta(222, "Roger Jean");
        banco1.criarNovaConta(333, "Matuê");
        banco1.criarNovaConta(444, "Pedro");

        banco1.verificarSaldo(111);

        banco1.depositarConta(111, 500.00);
        banco1.verificarSaldo(111);

        banco1.sacarConta(111, 200.00);
        banco1.verificarSaldo(111);
    }
}
