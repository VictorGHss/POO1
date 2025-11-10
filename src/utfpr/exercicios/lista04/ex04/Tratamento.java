package utfpr.exercicios.lista04.ex04;

public class Tratamento {
    private String descricao;
    private String dataInicio;
    private String dataFim;

    public Tratamento(String descricao, String dataInicio) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = null;
    }

    public void finalizarTratamento(String dataFim) {
        this.dataFim = dataFim;
    }

    public void imprimirTratamento() {
        System.out.println("--- Tratamento ---");
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Data de fim: " + (dataFim != null ? dataFim : "Em andamento"));
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }
}
