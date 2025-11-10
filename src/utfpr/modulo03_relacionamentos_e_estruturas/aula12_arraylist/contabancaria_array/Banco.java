package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist.contabancaria_array;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String cnpj;
    private String nomeBanco;
    private List<ContaBancaria> contaBancarias;

    public Banco(String cnpj, String nomeBanco) {
        this.cnpj = cnpj;
        this.nomeBanco = nomeBanco;
        this.contaBancarias = new ArrayList<>();
    }

    public void criarNovaConta(int numConta, String nomeTitular) {
        if (this.verificarConta(numConta)) {
            System.out.println("Já existe uma conta de número: " + numConta);
            return;
        }
        ContaBancaria contaBancaria = new ContaBancaria(numConta, nomeTitular);
        this.contaBancarias.add(contaBancaria);
        System.out.println("ContaBancaria " + numConta + " criada com sucesso!");
    }

    private boolean verificarConta(int numConta) {
        for (ContaBancaria contaBancaria : contaBancarias) {
            if (contaBancaria.getNumConta() == numConta) {
                return true;
            }
        }
        return false;
    }

    public void listarTodasContas() {
        for (int i = 0; i < this.contaBancarias.size(); i++) {
            ContaBancaria contaBancaria = this.contaBancarias.get(i);
            contaBancaria.imprimirDados();
        }
    }

    public void excluirConta(int numConta) {
        for (ContaBancaria contaBancaria : contaBancarias) {
            if (contaBancaria.getNumConta() == numConta) {
                this.contaBancarias.remove(contaBancaria);
                System.out.println("ContaBancaria " + numConta + " removida com sucesso!!");
                return;
            }
        }
        System.out.println("ContaBancaria " + numConta + " não encontrada.");
    }

    public void verificarSaldo(int numConta){
        for (ContaBancaria contabancaria : contaBancarias){
            if (contabancaria.getNumConta() == numConta){
                contabancaria.imprimirDados();
                return;
            }
        }
        System.out.println("ContaBancaria inexistente.");
    }

    public void depositarConta(int numConta, double valor) {
        for (ContaBancaria contaBancaria : contaBancarias) {
            if (contaBancaria.getNumConta() == numConta) {
                contaBancaria.realizarDeposito(valor);
                return;
            }
        }
        System.out.println("ContaBancaria inexistente.");
    }

    public void sacarConta(int numConta, double valor) {
        for (ContaBancaria contaBancaria : contaBancarias) {
            if (contaBancaria.getNumConta() == numConta) {
                contaBancaria.realizarSaque(valor);
                return;
            }
        }
        System.out.println("ContaBancaria inexistente.");
    }
}
