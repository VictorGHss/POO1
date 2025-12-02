package utfpr.exercicios.lista05.ex01;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    private String nomeCliente;
    private String cpfCliente;

    public ContaBancaria(int numConta, String nomeCliente, String cpfCliente) {
        this.numConta = numConta;
        this.saldo = 0;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
