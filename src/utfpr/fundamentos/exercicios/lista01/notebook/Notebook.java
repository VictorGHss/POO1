package utfpr.fundamentos.exercicios.lista01.notebook;

public class Notebook {
    String marca;
    String modelo;
    int polegadas;
    String processador;
    int ram;
    int armazenamento;

    public void ligar() {
        System.out.println(modelo + " " + marca + " está inicializado...");
        System.out.println(modelo + " " + marca + " ligou!");
    }

    public void conectarInternet() {
        System.out.println(modelo + " " + marca + " conectando na internet...");
        System.out.println(modelo + " " + marca + " está conectado na internet!");
    }

    public void processarInfo() {
        System.out.println(modelo + " " + marca + " está processando informações...");
        System.out.println(modelo + " " + marca + " processou as informações!");
    }

    public void desligar(){
        System.out.println(modelo + " " + marca + " desligou!");
    }

    public void imprimirDados() {
        System.out.println("===== Informações das máquinas =====");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Monitor: " + polegadas + " polegadas");
        System.out.println("Processador: " + processador);
        System.out.println("Ram: " + ram + " GB de RAM");
        System.out.println("Armazenamento: " + armazenamento + " GB de armazenamento");
    }
}
