package utfpr.fundamentos.aula07_construtor;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Celta", "Chevrolet", 2003);
        System.out.println(carro1.modelo);
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);
    }
}
