package utfpr.fundamentos.aula09_encapsulamento.exercicio01;

import java.util.Scanner;

public class RelogioTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Relogio rg1 = new Relogio("Rolex", 24, 60);
        rg1.imprimirDados();
        rg1.horarioValido(rg1.getHora(), rg1.getMinutos());
        System.out.println("-----------------------------");

        Relogio rg2 = new Relogio("Samsung", 12, 30);
        rg2.imprimirDados();
        rg2.horarioValido(rg2.getHora(), rg2.getMinutos());
        System.out.println("-----------------------------");

        Relogio rg3 = new Relogio("Casio", 10, 45);
        rg3.imprimirDados();
        rg3.horarioValido(rg3.getHora(), rg3.getMinutos());
        System.out.println("-----------------------------");

        Relogio rg4 = new Relogio("Seiko", 15, 15);
        rg4.imprimirDados();
        rg4.horarioValido(rg4.getHora(), rg4.getMinutos());
        System.out.println("-----------------------------");


        Relogio rg5 = new Relogio("Omega", 8, 0);
        rg5.imprimirDados();
        rg5.horarioValido(rg5.getHora(), rg5.getMinutos());
        System.out.println("-----------------------------");



    }
}
