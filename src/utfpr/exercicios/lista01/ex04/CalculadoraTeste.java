package utfpr.exercicios.lista01.ex04;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora("Casio", "FX-991EX", "Científica", 1000);
        Calculadora calculadora2 = new Calculadora("Texas Instruments", "TI-84 Plus", "Gráfica", 2000);

        System.out.println("---- Calculadora 1 ----");
        calculadora1.imprimirDados();
        calculadora1.ligar();
        calculadora1.somar(5, 3);
        calculadora1.subtrair(10, 4);
        calculadora1.multiplicar(6, 7);
        calculadora1.dividir(8, 2);
        calculadora1.desligar();

        System.out.println("---- Calculadora 2 ----");
        calculadora2.imprimirDados();
        calculadora2.ligar();
        calculadora2.somar(15, 5);
        calculadora2.subtrair(20, 8);
        calculadora2.multiplicar(9, 3);
        calculadora2.dividir(18, 6);
        calculadora2.desligar();


    }
}
