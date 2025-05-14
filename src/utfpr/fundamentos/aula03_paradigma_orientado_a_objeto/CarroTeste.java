package utfpr.fundamentos.aula03_paradigma_orientado_a_objeto;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("===Cadastro de Carro===");

        System.out.println("Digite o modelo do carro: ");
        carro1.modelo = sc.nextLine();

        System.out.println("Digite a marca do carro: ");
        carro1.marca = sc.nextLine();

        System.out.println("Digite a placa do carro: ");
        carro1.placa = sc.nextLine();

        System.out.println("Digite a cor do carro: ");
        carro1.cor = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        carro1.ano = sc.nextInt();
        sc.nextLine();
        System.out.println("==============================");

        System.out.println("===Informações sobre o Carro===");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Placa: " + carro1.placa);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Ano: " + carro1.ano);



    }
}
