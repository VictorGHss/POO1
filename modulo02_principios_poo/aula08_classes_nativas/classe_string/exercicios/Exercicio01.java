package utfpr.modulo02_principios_poo.aula08_classes_nativas.classe_string.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "Brutal não sobra nada pro beta, it's over!!";
        System.out.println(frase);

        System.out.println(frase.charAt(3));

        System.out.println(frase.length());

        System.out.println(frase.toUpperCase());

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        System.out.println("Digite uma frase: ");
        String fraseDigitada = sc.nextLine();

        if(fraseDigitada.equals(frase)){
            System.out.println("As frases são iguais");
        } else {
            System.out.println("As frases são diferentes");
        }
    }
}
