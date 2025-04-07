package utfpr.fundamentos.exercicios.lista01.carro;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        System.out.println("====== Concessionaria Simas Turbo ======");
        System.out.println("Insira as informações do 1° Carro:");
        System.out.print("Modelo: ");
        carro1.modelo = sc.nextLine();

        System.out.print("Marca: ");
        carro1.marca = sc.nextLine();

        System.out.print("Cor: ");
        carro1.cor = sc.nextLine();

        System.out.print("Ano: ");
        carro1.ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Renavam: ");
        carro1.renavam = sc.nextInt();
        sc.nextLine();

        System.out.print("Placa: ");
        carro1.placa = sc.nextLine();

        System.out.println("\nInsira as informações do 2° Carro:");
        System.out.print("Modelo: ");
        carro2.modelo = sc.nextLine();

        System.out.print("Marca: ");
        carro2.marca = sc.nextLine();

        System.out.print("Cor: ");
        carro2.cor = sc.nextLine();

        System.out.print("Ano: ");
        carro2.ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Renavam: ");
        carro2.renavam = sc.nextInt();
        sc.nextLine();

        System.out.print("Placa: ");
        carro2.placa = sc.nextLine();

        System.out.println("\nInsira as informações do 3° Carro:");
        System.out.print("Modelo: ");
        carro3.modelo = sc.nextLine();

        System.out.print("Marca: ");
        carro3.marca = sc.nextLine();

        System.out.print("Cor: ");
        carro3.cor = sc.nextLine();

        System.out.print("Ano: ");
        carro3.ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Renavam: ");
        carro3.ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Placa: ");
        carro3.placa = sc.nextLine();

        carro1.imprimirDados("1");
        carro2.imprimirDados("2");
        carro3.imprimirDados("3");

        sc.close();

        carro1.ligar();
        carro2.ligar();
        carro3.ligar();

        carro1.acelerar();
        carro2.acelerar();
        carro3.acelerar();

        carro1.frear();
        carro2.frear();
        carro3.frear();

        carro1.desligar();
        carro2.desligar();
        carro3.desligar();
    }
}