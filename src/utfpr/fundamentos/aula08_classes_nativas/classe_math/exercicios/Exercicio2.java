package utfpr.fundamentos.aula08_classes_nativas.classe_math.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em graus: ");
        double graus = sc.nextDouble();
        sc.nextLine();

        System.out.println("Seno: " + Math.sin(graus));
        System.out.println("Cosseno: " + Math.cos(graus));
        System.out.println("Tangente: " + Math.tan(graus));
    }
}
