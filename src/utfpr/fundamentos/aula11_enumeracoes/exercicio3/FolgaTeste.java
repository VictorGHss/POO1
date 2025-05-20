package utfpr.fundamentos.aula11_enumeracoes.exercicio3;

public class FolgaTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario (111, "João Pinto", "Gogoboy", "123.456.789-02");

        f1.setFolga(DiaSemana.QUARTA);

        f1.imprimirRelatorio();
    }
}
