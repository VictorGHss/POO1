package utfpr.exercicios.lista01.ex03;

public class NotebookTeste {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Dell", "Inspiron 15", "Intel Core i7", 16, 512, 15.6);
        Notebook notebook2 = new Notebook("Apple", "MacBook Pro", "Apple M1", 8, 256, 13.3);

        System.out.println("========== Notebook 1 ==========");
        notebook1.ligar();
        notebook1.processarInformarcoes();
        notebook1.conectarInternet();
        notebook1.desligar();
        notebook1.imprimirInformacoes();

        System.out.println("\n========== Notebook 2 ==========");
        notebook2.ligar();
        notebook2.processarInformarcoes();
        notebook2.conectarInternet();
        notebook2.desligar();
        notebook2.imprimirInformacoes();
    }
}
