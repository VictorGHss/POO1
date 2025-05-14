package utfpr.fundamentos.exercicios.lista01.carro;

public class Carro {
    String modelo;
    String marca;
    String cor;
    int ano;
    int renavam;
    String placa;

    public void ligar() {
        System.out.println(modelo + " (" + placa + ") está ligando...");
    }

    public void desligar() {
        System.out.println(modelo + " (" + placa + ") está desligando...");
    }

    public void acelerar() {
        System.out.println(modelo + " (" + placa + ") está acelerando...");
    }

    public void frear() {
        System.out.println(modelo + " (" + placa + ") está freando...");
    }

    public void imprimirDados(String numeroCarro) {
        System.out.println("/n====== Dados do Carro N° " + numeroCarro + " ======");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Renavam: " + renavam);
        System.out.println("Placa: " + placa);

    }
}
