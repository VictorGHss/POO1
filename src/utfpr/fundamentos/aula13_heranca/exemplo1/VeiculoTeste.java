package utfpr.fundamentos.aula13_heranca.exemplo1;

public class VeiculoTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Corola", "Chevrolet", "Gasolina", 2003, 5, 4);
        carro1.abastecer();
        carro1.calibrarPneus();

        Aviao aviao1 = new Aviao("Boeing 747", "Boeing", "Querosene", 2010, 400, 10000);
        aviao1.abastecer();
        aviao1.voar();
    }
}