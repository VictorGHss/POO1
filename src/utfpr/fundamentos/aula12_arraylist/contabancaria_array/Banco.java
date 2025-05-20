package utfpr.fundamentos.aula12_arraylist.contabancaria_array;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String cnpj;
    private String nomeBanco;
    private List <ContaBancaria> contas;

    public Banco(String cnpj, String nomeBanco) {
        this.cnpj = cnpj;
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void criarNovaConta(int numConta, String nomeTitular) {
        if (this.verificarConta(numConta)){
            System.out.println("Já existe uma conta de número: " + numConta);
            return;
        }
        ContaBancaria contaBancaria = new ContaBancaria(numConta, nomeTitular);
        this.contas.add(contaBancaria);
        System.out.println("Conta " + numConta + " criada com sucesso!");
    }

    private boolean verificarConta(int numConta){
        for(ContaBancaria contaBancaria : contas){
            if (contaBancaria.getNumConta() == numConta){
                return true;
            }
        }
        return false;
    }

    public void excluirConta(int numConta){
        for (ContaBancaria contaBancaria : contas) {
            if(contaBancaria.getNumConta() == numConta){
                contas.remove(contaBancaria);
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }

    public void verificarSaldo(int numConta){
        for(ContaBancaria contaBancaria : contas){
            if(contaBancaria.getNumConta() == numConta){
                contaBancaria.verificarSaldo(contaBancaria.getSaldo());
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }

    public void depositarConta(int numConta, double valor){
        for(ContaBancaria contaBancaria : contas){
            if(contaBancaria.getNumConta() == numConta){
                contaBancaria.realizarDeposito(valor);
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }

    public void sacarConta(int numConta, double valor){
        for(ContaBancaria contaBancaria : contas){
            if(contaBancaria.getNumConta() == numConta){
                contaBancaria.realizarSaque(valor);
                return;
            }
        }
        System.out.println("Conta inexistente.");
    }
}
