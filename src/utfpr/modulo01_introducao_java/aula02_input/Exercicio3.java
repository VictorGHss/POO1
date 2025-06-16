package utfpr.modulo01_introducao_java.aula02_input;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da sua compra: ");
        Scanner sc = new Scanner(System.in);
        double valorCompra = sc.nextDouble();
        sc.nextLine();

        System.out.println("Parabens, você ganhou um desconto de 10% na sua compra");
        double desconto = valorCompra * 0.10;
        double valorFinal = valorCompra - desconto;
        System.out.println("O valor da sua compra com desconto é: " + valorFinal);

    }
}
