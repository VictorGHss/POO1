package utfpr.exercicios.lista01.ex01;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private String chassi;
    private int ano;
    private int renavam;

    public Carro(String modelo, String marca, String cor, String placa, String chassi, int ano, int renavam) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.ano = ano;
        this.renavam = renavam;
    }

    public void ligar(){
        System.out.println(modelo + " " + marca + " está ligado.");
    }
    
    public void desligar(){
        System.out.println(modelo + " " + marca + " está desligado.");
    }
    
    public void acelerar(){
        System.out.println(modelo + " " + marca + " está acelerando.");
    }
    
    public void frear(){
        System.out.println(modelo + " " + marca + " está freando.");
    }

    public void imprimirDados(){
        System.out.println("--- Informações do Carro ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Ano: " + ano);
        System.out.println("Renavam: " + renavam);
    }
}
