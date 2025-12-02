package utfpr.modulo02_principios_poo.aula07_construtor.exercicio1_pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Marilia", 19, 42.1);
        p1.imprimirDados();
        p1.falar();
        p1.andar();
        p1.correr();

        Pessoa p2 = new Pessoa ("Bruno", 24, 68.2);
        p2.imprimirDados();
        p2.falar();
        p2.andar();
        p2.correr();
    }
}
