package utfpr.fundamentos.exercicios.lista01.calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();
        Calculadora calc3 = new Calculadora();

        System.out.println("\\n=== Cadastro da 1° Calculadora ===");
        System.out.println("Marca: ");
        calc1.marca = sc.nextLine();

        System.out.println("Modelo: ");
        calc1.modelo = sc.nextLine();

        System.out.println("Tipo: ");
        calc1.tipo = sc.nextLine();

        System.out.println("Memoria: ");
        calc1.memoria = sc.nextInt();
        sc.nextLine();

        System.out.println("\\n=== Cadastro da 2° Calculadora ===");
        System.out.println("Marca: ");
        calc2.marca = sc.nextLine();

        System.out.println("Modelo: ");
        calc2.modelo = sc.nextLine();

        System.out.println("Tipo: ");
        calc2.tipo = sc.nextLine();

        System.out.println("Memoria: ");
        calc2.memoria = sc.nextInt();
        sc.nextLine();

        System.out.println("\\n=== Cadastro da 3° Calculadora ===");
        System.out.println("Marca: ");
        calc3.marca = sc.nextLine();

        System.out.println("Modelo: ");
        calc3.modelo = sc.nextLine();

        System.out.println("Tipo: ");
        calc3.tipo = sc.nextLine();

        System.out.println("Memoria: ");
        calc3.memoria = sc.nextInt();
        sc.nextLine();

        System.out.println("\n=== Operações com a 1ª Calculadora ===");
        calc1.imprimirDados();
        calc1.ligar();

        System.out.print("Digite o primeiro número: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());

        calc1.somar(num1, num2);
        calc1.subtrair(num1, num2);
        calc1.multiplicar(num1, num2);
        calc1.dividir(num1, num2);

        calc1.desligar();

        System.out.println("\n=== Operações com a 2ª Calculadora ===");
        calc2.imprimirDados();
        calc2.ligar();

        System.out.print("Digite o primeiro número: ");
        num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o segundo número: ");
        num2 = Double.parseDouble(sc.nextLine());

        calc2.somar(num1, num2);
        calc2.subtrair(num1, num2);
        calc2.multiplicar(num1, num2);
        calc2.dividir(num1, num2);

        calc2.desligar();

        System.out.println("\n=== Operações com a 3ª Calculadora ===");
        calc3.imprimirDados();
        calc3.ligar();

        System.out.print("Digite o primeiro número: ");
        num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o segundo número: ");
        num2 = Double.parseDouble(sc.nextLine());

        calc3.somar(num1, num2);
        calc3.subtrair(num1, num2);
        calc3.multiplicar(num1, num2);
        calc3.dividir(num1, num2);

        calc3.desligar();

        sc.close();
    }
}