package utfpr.modulo01_introducao_java.aula02_input;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe sua escolaridade: ");
        String escolaridade = sc.nextLine();
        System.out.println("=====================");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Escolaridade: " + escolaridade);

    }
}
