package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist.exercicios.exercicio1;

import java.util.Scanner;
import java.util.ArrayList;
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Informe 5 valores inteiros: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Valor " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }

        double media = (double) soma /numeros.size();

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media aritmetica: " + media);
    }
}
