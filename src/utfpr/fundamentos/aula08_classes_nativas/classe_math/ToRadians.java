package utfpr.fundamentos.aula08_classes_nativas.classe_math;

public class ToRadians {
    public static void main(String[] args) {

        double graus = 30;
        double radianos = Math.toRadians(graus);

        System.out.println("Graus: " + graus);
        System.out.println("Radianos: " + radianos);
    }
}
