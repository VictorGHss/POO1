package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist.contabancaria_array;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String cnpj;
    private String nomeBanco;
    private List<ContaBancaria> contas;

    public Banco(String cnpj, String nomeBanco) {
        this.cnpj = cnpj;
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void criarNovaConta(int numConta, String nomeTitular) {
        if (this.verificarConta(numConta)) {
            System.out.println("Já existe uma conta de número: " + numConta);
            return;
        }
        ContaBancaria contaBancaria = new ContaBancaria(numConta, nomeTitular);
        this.contas.add(contaBancaria);
        System.out.println("Conta " + numConta + " criada com sucesso!");
    }

    private boolean verificarConta(int numConta) {
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.getNumConta() == numConta) {
                return true;
            }
        }
        return false;
    }

    public void listarTodasContas() {
        for (int i = 0; i < this.contas.size(); i++) {
            ContaBancaria contaBancaria = this.contas.get(i);
            contaBancaria.imprimirDados();
        }
    }

    public void excluirConta(int numConta) {
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.getNumConta() == numConta) {
                this.contas.remove(contaBancaria);
                System.out.println("Conta " + numConta + " removida com sucesso!!");
                return;
            }
        }
        System.out.println("Conta " + numConta + " não encontrada.");
    }

    public void verificarSaldo(int numConta){
        for (ContaBancaria contabancaria : contas){
            if (contabancaria.getNumConta() == numConta){
                contabancaria.imprimirDados();
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }

    public void depositarConta(int numConta, double valor) {
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.getNumConta() == numConta) {
                contaBancaria.realizarDeposito(valor);
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }

    public void sacarConta(int numConta, double valor) {
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.getNumConta() == numConta) {
                contaBancaria.realizarSaque(valor);
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }
}
