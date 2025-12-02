package utfpr.exercicios.lista01.ex01;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "Volkswagen", "Azul", "ABC-1234", "1234567890", 1975, 123456789);

        carro.imprimirDados();
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
    }
}
