package utfpr.fundamentos.aula06.exercicioconstantes;

public class TempoQueda {
    public static final double GRAVIDADE = 9.81; // Aceleração da gravidade em m/s²

    public static double calcularTempoQueda(double altura) {
        return Math.sqrt((2 * altura) / GRAVIDADE);
    }
}
