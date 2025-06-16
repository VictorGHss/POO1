package utfpr.modulo02_principios_poo.aula05_metodos;

public class Carro {

    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;

    public void ligar() {

        System.out.println(marca + " " + modelo + " está ligando.");
    }

    public void desligar() {

        System.out.println(marca + " " + modelo + " está desligando.");
    }

    public void acelerar() {

        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    public void frear() {

        System.out.println(marca + " " + modelo + " está freando.");
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
                + "]";
    }
}
