package utfpr.fundamentos.exercicios.lista05.hotel;

public class Hospede {
    private String nome;
    private String cpf;
    private int horaCheckIn;

    public Hospede(String nome, String cpf, int horaCheckIn) {
        this.nome = nome;
        this.cpf = cpf;
        this.horaCheckIn = horaCheckIn;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getHoraCheckIn() {
        return horaCheckIn;
    }
}
