package utfpr.exercicios.lista05.ex01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void addConta(int numConta, String nomeCliente, String cpfCliente) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                System.out.println("Conta já cadastrada!");
                return;
            }
        }

        ContaBancaria conta = new ContaBancaria(numConta, nomeCliente, cpfCliente);
        this.contas.add(conta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public void realizarDeposito(int numConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                System.out.println("Deposito realizado com sucesso!");
            }
        }
    }

    public void realizarSaque(int numConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                conta.setSaldo(conta.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            }
        }
    }
}
