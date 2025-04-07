package utfpr.fundamentos.exercicios.lista01.notebook;

import java.util.Scanner;

public class NotebookTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notebook note1 = new Notebook();
        Notebook note2 = new Notebook();
        Notebook note3 = new Notebook();

        System.out.println("===== Assistência do Jalam =====");
        System.out.println("Digite as informações do 1° notebook.");

        System.out.println("Marca: ");
        note1.marca = sc.nextLine();

        System.out.println("Modelo: ");
        note1.modelo = sc.nextLine();

        System.out.println("Processador");
        note1.processador = sc.nextLine();

        System.out.println("Polegadas do monitor: ");
        note1.polegadas = sc.nextInt();
        sc.nextLine();

        System.out.println("RAM: ");
        note1.ram = sc.nextInt();
        sc.nextLine();

        System.out.println("Armazenamento: ");
        note1.armazenamento = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite as informações do 2° notebook.");

        System.out.println("Marca: ");
        note2.marca = sc.nextLine();

        System.out.println("Modelo: ");
        note2.modelo = sc.nextLine();

        System.out.println("Processador");
        note2.processador = sc.nextLine();

        System.out.println("Polegadas do monitor: ");
        note2.polegadas = sc.nextInt();
        sc.nextLine();

        System.out.println("RAM: ");
        note2.ram = sc.nextInt();
        sc.nextLine();

        System.out.println("Armazenamento: ");
        note2.armazenamento = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite as informações dos notebooks.");

        System.out.println("Marca: ");
        note3.marca = sc.nextLine();

        System.out.println("Modelo: ");
        note3.modelo = sc.nextLine();

        System.out.println("Processador");
        note3.processador = sc.nextLine();

        System.out.println("Polegadas do monitor: ");
        note3.polegadas = sc.nextInt();
        sc.nextLine();

        System.out.println("RAM: ");
        note3.ram = sc.nextInt();
        sc.nextLine();

        System.out.println("Armazenamento: ");
        note3.armazenamento = sc.nextInt();
        sc.nextLine();

        sc.close();

        note1.imprimirDados();
        note2.imprimirDados();
        note3.imprimirDados();

        note1.ligar();
        note1.conectarInternet();
        note1.processarInfo();
        note1.desligar();

        note2.ligar();
        note2.conectarInternet();
        note2.processarInfo();
        note2.desligar();

        note3.ligar();
        note3.conectarInternet();
        note3.processarInfo();
        note3.desligar();

    }
}
