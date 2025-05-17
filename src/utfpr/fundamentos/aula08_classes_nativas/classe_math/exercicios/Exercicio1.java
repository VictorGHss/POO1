package utfpr.fundamentos.aula08_classes_nativas.classe_math.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Raiz quadrada de " + num1 + ": " + Math.sqrt(num1));
        System.out.println("Potencia de " + num1 + " elevado a " + num2 + ": " + Math.pow(num1, num2));
    }
}
