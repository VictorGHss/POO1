package utfpr.fundamentos.aula06_variaveis.exercicioinstancia;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("===== Prefeitura de Jabatiuma =====");
        System.out.println("===== Cadastro de pessoas =====");
        System.out.println("Digite as informações da 1° pessoa: ");

        System.out.println("Nome: ");
        p1.nome = sc.nextLine();

        System.out.println("Idade: ");
        p1.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Altura: ");
        p1.altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Peso: ");
        p1.peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite as informações da 2° pessoa: ");

        System.out.println("Nome: ");
        p2.nome = sc.nextLine();

        System.out.println("Idade: ");
        p2.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Altura: ");
        p2.altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Peso: ");
        p2.peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite as informações da 3° pessoa: ");

        System.out.println("Nome: ");
        p3.nome = sc.nextLine();

        System.out.println("Idade: ");
        p3.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Altura: ");
        p3.altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Peso: ");
        p3.peso = sc.nextDouble();
        sc.nextLine();

        p1.imprimirDados();
        p2.imprimirDados();
        p3.imprimirDados();

        sc.close();

        p1.andar();
        p1.correr();
        p1.falar();
        p1.dormir();

        p2.andar();
        p2.correr();
        p2.falar();
        p2.dormir();

        p3.andar();
        p3.correr();
        p3.falar();
        p3.dormir();

    }
}
