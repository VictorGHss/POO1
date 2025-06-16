package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.sobrecarga.exemplo02;

public class Mensageiro {
    public void imprimirMensagem(String texto) {
        System.out.println("Mensagem: " + texto);
    }

    public void imprimirMensagem(int numero) {
        System.out.println("Número: " + numero);
    }

    public void imprimirMensagem(String texto, int numero) {
        System.out.println(numero + ", escreveu: " + texto);
    }
}
