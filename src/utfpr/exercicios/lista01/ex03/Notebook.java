package utfpr.exercicios.lista01.ex03;

public class Notebook {
    private String marca;
    private String modelo;
    private String modeloProcessador;
    private int memoriaRam;
    private int armazenamento;
    private double polegadas;

    public Notebook(String marca, String modelo, String modeloProcessador, int memoriaRam, int armazenamento, double polegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.modeloProcessador = modeloProcessador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.polegadas = polegadas;
    }

    public void ligar(){
        System.out.println("Notebook " + marca + " " + modelo + " está ligado.");
    }

    public void desligar(){
        System.out.println("Notebook " + marca + " " + modelo + " está desligado.");
    }

    public void processarInformarcoes(){
        System.out.println("Notebook " + marca + " " + modelo + " está processando informações.");
    }

    public void conectarInternet(){
        System.out.println("Notebook " + marca + " " + modelo + " está ligado.");
    }

    public void imprimirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + modeloProcessador);
        System.out.println("Memória RAM: " + memoriaRam + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Tamanho da tela: " + polegadas + " polegadas");
    }
}
