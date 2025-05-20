package utfpr.fundamentos.aula12_arraylist.exercicios.exercicio2;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 500000; i++) {
            numeros.add(i);
        }

        long fimInsercao = System.currentTimeMillis();
        System.out.println("Tempo para inserir os números: " + (fimInsercao - inicio) + "ms");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        long fimImpressao = System.currentTimeMillis();
        System.out.println("Tempo total de execução: " + (fimImpressao - inicio) + "ms");
    }
}