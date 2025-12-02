package utfpr.exercicios.lista06.ex03;

public class ConcessionariaTeste {
    public static void main(String[] args) {
        System.out.println("=== Testes do Carro ===");
        Carro carro = new Carro("Chevrolet", "Celta", 2003, 14.000, 3.5, 4);
        carro.exibirDados();
        carro.calcularIpva();

        System.out.println("=== Testes da Moto ===");
        Moto moto = new Moto("Yamaha", "R1", 2010, 12.000, 2.0, "Cruzado");
        moto.exibirDados();
        moto.calcularIpva();

        System.out.println("=== Testes do Caminhão ===");
        Caminhao caminhao = new Caminhao("Ford", "Fusion", 2015, 18.000, 1.5, 6);
        caminhao.exibirDados();
        caminhao.calcularIpva();
    }
}
