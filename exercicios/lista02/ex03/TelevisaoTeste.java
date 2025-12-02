package utfpr.exercicios.lista02.ex03;

public class TelevisaoTeste {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao("Samsung", "QLED", 55.0, "4K");
        Televisao tv2 = new Televisao("LG", "OLED", 65.0, "4K");

        System.out.println("=== Televisão 1 ===");
        tv1.ligar();
        tv1.mudarCanal();
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.desligar();
        System.out.println(tv1);

        System.out.println("=== Televisão 2 ===");
        tv2.ligar();
        tv2.mudarCanal();
        tv2.aumentarVolume();
        tv2.diminuirVolume();
        tv2.desligar();
        System.out.println(tv1);
    }
}
