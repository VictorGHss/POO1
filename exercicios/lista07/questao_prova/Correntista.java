package utfpr.exercicios.lista07.questao_prova;

import java.util.ArrayList;
import java.util.List;

public class Correntista {
    private String nomeCorrentista;
    private List<Conta> contas;

    public Correntista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
}
