package utfpr.exercicios.lista02.ex03;

public class Televisao {
    private String marca;
    private String modelo;
    private double polegadas;
    private String resolucao;
    private int canalAtual;
    private int volume;

    public Televisao(String marca, String modelo, double polegadas, String resolucao) {
        this.marca = marca;
        this.modelo = modelo;
        this.polegadas = polegadas;
        this.resolucao = resolucao;
        this.canalAtual = 1;
        this.volume = 10;
    }

    public void ligar() {
        System.out.println("A televisão " + marca + " " + modelo + " está ligada.");
    }

    public void mudarCanal() {
        if (canalAtual < 99) {
            canalAtual++;
            System.out.println("Canal atual: " + canalAtual);
        } else {
            System.out.println("Você já está no canal máximo (99).");
        }
    }

    public void aumentarVolume() {
        if (volume > 100) {
            System.out.println("O volume já está no máximo.");
        } else {
            volume++;
            System.out.println("Volume atual: " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    public void desligar() {
        System.out.println("A televisão " + marca + " " + modelo + " está desligada.");
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", polegadas=" + polegadas +
                ", resolucao='" + resolucao + '\'' +
                ", canalAtual=" + canalAtual +
                ", volume=" + volume +
                '}';
    }
}
