package utfpr.fundamentos.aula02_input;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu sexo: ");
        String sexo = sc.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estadoCivil = sc.nextLine();

        System.out.println("Digite quantos filhos você tem: ");
        int filhos = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua escolaridade: ");
        String escolaridade = sc.nextLine();

        System.out.println("Digite sua renda mensal: ");
        double renda = sc.nextDouble();
        sc.nextLine();

        System.out.println(nome + ", individuo do sexo " + sexo + ", no momento está " + estadoCivil + ", tem " + filhos + " filhos, possui escolaridade " + escolaridade + " e uma renda mensal de R$" + renda + ".");


    }
}
