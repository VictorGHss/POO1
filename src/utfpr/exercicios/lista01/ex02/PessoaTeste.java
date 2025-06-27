package utfpr.exercicios.lista01.ex02;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Masculino", 12345678901L, 25, 180, 75.5);

        pessoa.imprimirDados();
        pessoa.andar();
        pessoa.correr();
        pessoa.falar("Olá, tudo bem?");
        pessoa.dormir();
    }
}
