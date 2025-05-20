package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cinema;

// MeiaEntrada.java
public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(int identificacao, double valorCheio, Sessao sessao) {
        super(identificacao, valorCheio, sessao);
        calcularValor();
    }

    public void calcularValor() {
        super.setValor(super.getValor() * 0.5);
    }

    @Override
    public String toString() {
        return "MeiaEntrada{" +
                "identificacao=" + getIdentificacao() +
                ", valor=" + String.format("%.2f", getValor()) +
                ", disponivel=" + isDisponivel() +
                ", sessaoId=" + (getSessao() != null ? getSessao().hashCode() : "N/A") +
                '}';
    }
}