package utfpr.fundamentos.exercicios.lista01.calculadora;

public class Calculadora {
    String marca;
    String modelo;
    String tipo;
    double memoria;

    public void ligar() {
        System.out.println("A calculadora " + modelo + " ligou!");
    }

    public void desligar() {
        System.out.println("A calculadora " + modelo + " desligou!");
    }

    public void somar(double a, double b) {
        System.out.println("Calculadora " + modelo + " está somando...");
        System.out.println("Resultado = " + a + " + " + b + " = " + (a + b));
    }

    public void subtrair(double a, double b){
        System.out.println("A calculadora " + modelo + " está subtraindo...");
        System.out.println("Resultado = " + a + " - " + b + " = " + (a-b));
    }

    public void multiplicar(double a, double b){
        System.out.println("A calculadora " + modelo + " está multiplicando...");
        System.out.println("Resultado = " + a + " * " + b + " = " + (a*b));
    }

    public void dividir(double a, double b){
        System.out.println("A calculadora " + modelo + " está dividindo...");
        System.out.println("Resultado: " + a + " / " + b + " = " + (a/b));
    }

    public void imprimirDados(){
        System.out.println("===== Informações da Calculadora =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Memoria: " + memoria);
        System.out.println("---------------------------");

    }

}
