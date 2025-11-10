package utfpr.exercicios.lista03.ex04;

public class CarroEletricoTeste {
    public static void main(String[] args) {
        CarroEletrico utforce = new CarroEletrico();

        System.out.println("=== Testando acelerar e frear com o carro desligado ===");
        utforce.acelerar();
        utforce.frear();

        System.out.println("=== Acelerando e freando com o carro ligado ===");
        utforce.ligar();
        utforce.acelerar();
        utforce.frear();

        System.out.println("=== Acelerando até a velocidade máxima ===");
        for (int i = 0; i < 30; i++) {
            utforce.acelerar(); // Acelera 30 vezes
        }

        System.out.println("=== Freando até parar ===");
        for (int i = 0; i < 30; i++) {
            utforce.frear(); // Freia 30 vezes
        }
    }
}