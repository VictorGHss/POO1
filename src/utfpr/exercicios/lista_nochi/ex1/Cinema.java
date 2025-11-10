package utfpr.exercicios.lista_nochi.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
    private List<Integer> idades;
    private List<Character> opinioes;

    public Cinema() {
        this.idades = new ArrayList<>();
        this.opinioes = new ArrayList<>();
    }

    public void realizarPesquisa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Pesquisa de opinião do CineBoga ====");
        {
            System.out.println("Opinioes: A - Ótimo | B - Bom | C - Regular | D - Ruim | E - Péssimo");
            System.out.println("Digite idade 0 para encerrar a pesquisa\n");
        }

        while (true) {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade == 0) {
                break;
            }

            if (idade > 0 && idade > 110) {
                System.out.println("Idade invalidaa");
                continue;
            }
            char opiniao;
            while (true) {
                System.out.println("Digite sua opinião (A/B/C/D/E): ");
                String input = sc.nextLine().toUpperCase();

                if (input.length() == 1) {
                    opiniao = input.charAt(0);
                    if (opiniao == 'A' || opiniao == 'B' || opiniao == 'C' || opiniao == 'D' || opiniao == 'E') {
                        break;
                    }
                }
                System.out.println("Opinião inválida! Digite A, B, C, D ou E.");
            }

            idades.add(idade);
            opinioes.add(opiniao);
            System.out.println("Resposta registrada!\n");
        }

        sc.close();
    }

    public void exibirResultados() {
        if (idades.isEmpty()) {
            System.out.println("\nNenhuma pessoa respondeu à pesquisa.");
            return;
        }

        System.out.println("\n===== Resultados da Pesquisa =====");

        int quantidadePessoas = idades.size();
        System.out.println("Quantidade de pessoas que responderam: " + quantidadePessoas);

        double mediaIdade = calcularMediaIdade();
        System.out.printf("Média de idade: %.2f anos\n", mediaIdade);

        System.out.println("\nPorcentagem de opiniões:");
        calcularPorcentagemOpinioes();
    }

    private double calcularMediaIdade() {
        int somaIdades = 0;
        for (int idade : idades) {
            somaIdades += idade;
        }
        return (double) somaIdades / idades.size();
    }

    public void calcularPorcentagemOpinioes() {
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        for (char opiniao : opinioes) {
            switch (opiniao) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                case 'E':
                    countE++;
                    break;
            }
        }

        System.out.println("A - Ótimo:    " + countA + " respostas (" + (countA * 100.0 / opinioes.size()) + "%)");
        System.out.println("B - Bom:      " + countB + " respostas (" + (countB * 100.0 / opinioes.size()) + "%)");
        System.out.println("C - Regular:  " + countC + " respostas (" + (countC * 100.0 / opinioes.size()) + "%)");
        System.out.println("D - Ruim:     " + countD + " respostas (" + (countD * 100.0 / opinioes.size()) + "%)");
        System.out.println("E - Péssimo:  " + countE + " respostas (" + (countE * 100.0 / opinioes.size()) + "%)");
    }
}
