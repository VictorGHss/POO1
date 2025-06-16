package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.exercicio.cinema;

// Ingresso.java
public class Ingresso {
    private int identificacao;
    private double valor;
    private boolean disponivel;
    private Sessao sessao;

    public Ingresso(int identificacao, double valor, Sessao sessao) {
        this.identificacao = identificacao;
        this.valor = valor;
        this.disponivel = true;
        this.sessao = sessao;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public void venderIngresso() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Ingresso " + identificacao + " vendido por R$" + String.format("%.2f", valor));
        } else {
            System.out.println("Ingresso " + identificacao + " não está mais disponível.");
        }
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "identificacao=" + identificacao +
                ", valor=" + String.format("%.2f", valor) +
                ", disponivel=" + disponivel +
                ", sessaoId=" + (sessao != null ? sessao.hashCode() : "N/A") +
                '}';
    }
}
