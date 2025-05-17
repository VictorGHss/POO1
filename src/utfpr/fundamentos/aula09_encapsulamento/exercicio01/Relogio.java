package utfpr.fundamentos.aula09_encapsulamento.exercicio01;

public class Relogio {
    private String marca;
    private int hora;
    private int minutos;

    public Relogio(String marca, int hora, int minutos) {
        this.marca = marca;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getMarca() {
        return marca;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void horarioValido(int hora, int minutos) {
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Horário inválido");
        } else {
            System.out.println("Horário válido");
        }
    }

    public void imprimirDados(){
        System.out.println("----- Info dos Relógios -----");
        System.out.println("Marca: " + marca);
        System.out.println("Horário: " + hora + "h" + " e " + minutos + " minutos");
    }
}
