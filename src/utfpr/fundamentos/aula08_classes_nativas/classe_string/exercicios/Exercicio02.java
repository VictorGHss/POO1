package utfpr.fundamentos.aula08_classes_nativas.classe_string.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        double num2;

        System.out.println("Digite o número inteiro: ");
        int num1Dig = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número double: ");
        double num2Dig = sc.nextDouble();
        sc.nextLine();

        String num1Str = String.valueOf(num1Dig);
        String num2Str = String.valueOf(num2Dig);

        System.out.println("--Números convertidos em String--");
        System.out.println("Número inteiro: " + num1Str);
        System.out.println("Número double: " + num2Str);

    }
}
