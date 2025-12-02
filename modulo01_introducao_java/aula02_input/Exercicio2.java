package utfpr.modulo01_introducao_java.aula02_input;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
        }
        if (num1 > num3) {
            System.out.println("O número maior é: " + num1);
        } else if (num2 > num3) {
            System.out.println("O número maior é: " + num2);
        } else if (num3 > num2) {
            System.out.println("O maior numero é: " + num3);
        }

    }
}
