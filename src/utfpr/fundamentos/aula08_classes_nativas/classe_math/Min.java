package utfpr.fundamentos.aula08_classes_nativas.classe_math;

public class Min {
    public static void main(String[] args) {

        double valor1 = 1024;
        double valor2 = 2048;

        double valorMenor = Math.min(valor1, valor2);

        System.out.println(valorMenor);
    }
}
