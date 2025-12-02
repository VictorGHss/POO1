package utfpr.exercicios.lista03.ex04;

public class CarroEletrico {
    private String modelo;
    private int marcha;
    private int velocidade;
    private boolean ligado;

    public CarroEletrico() {
        this.modelo = "UTForce e-Racing";
        this.marcha = 0;
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        System.out.println(modelo + " está ligado. \n Marcha atual: " + marcha);
        setLigado(true);
    }

    private void atualizarMarcha() {
        if (velocidade == 0) {
            marcha = 0;
        } else if (velocidade >= 1 && velocidade <= 19) {
            marcha = 1;
        } else if (velocidade >= 20 && velocidade <= 39) {
            marcha = 2;
        } else if (velocidade >= 40 && velocidade <= 59) {
            marcha = 3;
        } else if (velocidade >= 60 && velocidade <= 89) {
            marcha = 4;
        } else if (velocidade >= 90 && velocidade <= 130) {
            marcha = 5;
        }
    }

    public void acelerar() {
        if (ligado) {
            if (velocidade < 130) {
                velocidade += 5;
                if (velocidade > 130) velocidade = 130;
                atualizarMarcha();
                System.out.println(modelo + " acelerou 5km/h.\nMarcha atual: " + marcha + "\nVelocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("Velocidade máxima atingida.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void frear() {
        if (ligado) {
            if (velocidade > 0) {
                velocidade -= 5;
                if (velocidade < 0) velocidade = 0;
                atualizarMarcha();
                System.out.println(modelo + " freiou 5km/h.\nMarcha atual: " + marcha + "\nVelocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("O carro já está parado.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para frear.");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
