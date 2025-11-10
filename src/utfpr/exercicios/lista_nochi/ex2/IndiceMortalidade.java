package utfpr.exercicios.lista_nochi.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndiceMortalidade {

    private List<Crianca> criancas;
    private int totalCriancasNascidas;
    public IndiceMortalidade() {
        this.criancas = new ArrayList<>();
    }

    public void realizarPesquisa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PESQUISA DE MORTALIDADE INFANTIL =====\n");

        System.out.print("Digite o número de crianças nascidas no período: ");
        totalCriancasNascidas = scanner.nextInt();
        scanner.nextLine();

        if (totalCriancasNascidas <= 0) {
            System.out.println("Número inválido de crianças!");
            scanner.close();
            return;
        }

        System.out.println("\nPara cada criança que MORREU, informe os dados:");
        System.out.println("Quando terminar de informar as crianças mortas, digite 'N' para sexo.\n");

        int contador = 1;
        while (true) {
            char sexo;
            while (true) {
                System.out.print("Criança " + contador + " - Sexo (M/F) ou N para encerrar: ");
                String input = scanner.nextLine().toUpperCase();

                if (input.length() == 1) {
                    sexo = input.charAt(0);
                    if (sexo == 'N') {
                        scanner.close();
                        return;
                    }
                    if (sexo == 'M' || sexo == 'F') {
                        break;
                    }
                }
                System.out.println("Sexo inválido! Digite M, F ou N para encerrar.");
            }

            int mesesVida;
            while (true) {
                System.out.print("Tempo de vida (em meses): ");
                if (scanner.hasNextInt()) {
                    mesesVida = scanner.nextInt();
                    scanner.nextLine();
                    if (mesesVida >= 0) {
                        break;
                    }
                    System.out.println("Tempo de vida não pode ser negativo!");
                } else {
                    scanner.nextLine();
                    System.out.println("Digite um número válido!");
                }
            }

            criancas.add(new Crianca(sexo, mesesVida));
            System.out.println("Registro adicionado!\n");
            contador++;

            if (criancas.size() >= totalCriancasNascidas) {
                System.out.println("Todas as crianças nascidas foram registradas como mortas.");
                scanner.close();
                break;
            }
        }
    }

    public void exibirResultados() {
        if (totalCriancasNascidas == 0) {
            System.out.println("\nNenhum dado foi coletado.");
            return;
        }

        System.out.println("\n===== RESULTADOS DA PESQUISA =====");
        System.out.println("Total de crianças nascidas: " + totalCriancasNascidas);
        System.out.println("Total de crianças mortas registradas: " + criancas.size());

        calcularPorcentagemFemininasMortas();
        calcularPorcentagemMasculinosMortos();
        calcularPorcentagem24MesesOuMenos();
    }

    private void calcularPorcentagemFemininasMortas() {
        int criancasFeministasMortas = 0;

        for (Crianca crianca : criancas) {
            if (crianca.getSexo() == 'F') {
                criancasFeministasMortas++;
            }
        }

        double porcentagem = (criancasFeministasMortas * 100.0) / totalCriancasNascidas;
        System.out.printf("\nPorcentagem de crianças do sexo feminino mortas: %.2f%%", porcentagem);
        System.out.printf(" (%d de %d)\n", criancasFeministasMortas, totalCriancasNascidas);
    }

    private void calcularPorcentagemMasculinosMortos() {
        int criancasMasculinasMortas = 0;

        for (Crianca crianca : criancas) {
            if (crianca.getSexo() == 'M') {
                criancasMasculinasMortas++;
            }
        }

        double porcentagem = (criancasMasculinasMortas * 100.0) / totalCriancasNascidas;
        System.out.printf("Porcentagem de crianças do sexo masculino mortas: %.2f%%", porcentagem);
        System.out.printf(" (%d de %d)\n", criancasMasculinasMortas, totalCriancasNascidas);
    }

    private void calcularPorcentagem24MesesOuMenos() {
        int criancas24MesesOuMenos = 0;

        for (Crianca crianca : criancas) {
            if (crianca.getMesesVida() <= 24) {
                criancas24MesesOuMenos++;
            }
        }

        double porcentagem = (criancas24MesesOuMenos * 100.0) / totalCriancasNascidas;
        System.out.printf("Porcentagem de crianças que viveram 24 meses ou menos: %.2f%%", porcentagem);
        System.out.printf(" (%d de %d)\n", criancas24MesesOuMenos, totalCriancasNascidas);
    }

    private static class Crianca {
        private char sexo;
        private int mesesVida;

        public Crianca(char sexo, int mesesVida) {
            this.sexo = sexo;
            this.mesesVida = mesesVida;
        }

        public char getSexo() {
            return sexo;
        }

        public int getMesesVida() {
            return mesesVida;
        }

        public boolean estaMorta() {
            return mesesVida >= 0;
        }
    }
}
