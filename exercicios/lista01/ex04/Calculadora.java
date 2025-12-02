package utfpr.exercicios.lista01.ex04;

public class Calculadora {
    private String marca;
    private String modelo;
    private String tipo;
    private int memoria;

    public Calculadora(String marca, String modelo, String tipo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.memoria = memoria;
    }

    public void ligar() {
        System.out.println("Calculadora " + marca + " " + modelo + " ligada.");
    }

    public void somar(double a, double b) {
        double resultado = a + b;
        System.out.println("Calculadora " + marca + " " + modelo + " está somando: " + a + " + " + b + " = " + resultado);
    }

    public void subtrair(double a, double b) {
        double resultado = a - b;
        System.out.println("Calculadora " + marca + " " + modelo + " está subtraindo: " + a + " - " + b + " = " + resultado);
    }

    public void multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.println("Calculadora " + marca + " " + modelo + " está multiplicando: " + a + " * " + b + " = " + resultado);
    }

    public void dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return;
        }
        double resultado = a / b;
        System.out.println("Calculadora " + marca + " " + modelo + " está dividindo: " + a + " / " + b + " = " + resultado);
    }

    public void desligar() {
        System.out.println("Calculadora " + marca + " " + modelo + " desligada.");
    }

    public void imprimirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Memória: " + memoria + " bytes");
    }
}
