package utfpr.exercicios.lista07.ex04;

public class Filme {
    //Filme
    private String titulo;
    private int duracaoMinutos;
    private double precoLocacao;
    private double multaAtraso;
    private boolean disponivel = true;

    //Cliente
    private Cliente cliente;
    private int diaLocacao;
    private int diaPrevistoDevolucao;
    private int diaDevolucao;

    public Filme(String titulo, int duracaoMinutos, double precoLocacao, double multaAtraso, Cliente cliente, int diaLocacao) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.precoLocacao = precoLocacao;
        this.multaAtraso = 2.00;
        this.disponivel = true;
        this.cliente = cliente;
        this.diaLocacao = diaLocacao;
        this.diaPrevistoDevolucao = diaLocacao + 3;
        this.diaDevolucao = 0;
    }

    public void alugarFilme() {
        if (disponivel) {
            System.out.printf("Filme %s alugado com sucesso por %s, no dia %d \n", titulo, cliente.getNome(), diaLocacao);
            disponivel = false;
        } else {
            System.out.printf("Filme %s não está disponível para locação.", titulo);
        }
    }

    public void devolverFilme() {
        if (!disponivel) {
            System.out.printf("Filme %s devolvido com sucesso por %s, no dia %d \n", titulo, cliente.getNome(), diaDevolucao);
            System.out.printf("Valor total da locação: R$ %.2f \n", precoLocacao + calcularMulta());
            disponivel = true;
        } else {
            System.out.printf("Filme %s não estava alugado.", titulo);
        }
    }

    public double calcularMulta() {
        if (diaDevolucao > diaPrevistoDevolucao) {
            int diasAtraso = diaDevolucao - diaPrevistoDevolucao;
            double multaTotal = diasAtraso * multaAtraso;
            System.out.printf("Filme %s devolvido com atraso de %d dias. Multa tota: R$ %.2f \n", titulo, diasAtraso, multaTotal);
        } else {
            System.out.printf("Filme %s devolvido no prazo. Sem multa. \n", titulo);
            return 0;
        }
        return 0;
    }

    public void relatorioLocacao() {
        System.out.printf("Relatório de locação do filme %s: \n", titulo);
        System.out.printf("Duração: %d minutos \n", duracaoMinutos);
        System.out.printf("Preço da locação: R$ %.2f \n", precoLocacao);
        System.out.printf("Multa por atraso: R$ %.2f \n", multaAtraso);
        if (cliente != null) {
            System.out.printf("Cliente: %s, Dia de locação: %d, Dia previsto de devolução: %d, Dia de devolução: %d \n",
                    cliente.getNome(), diaLocacao, diaPrevistoDevolucao, diaDevolucao);
            System.out.println("Valor total da locação: " + (multaAtraso + precoLocacao) + " reais");
        } else {
            System.out.println("Nenhum cliente associado.");
        }
    }

    public void relatorioFilme() {
        System.out.printf("Título: %s \n", titulo);
        System.out.printf("Duração: %d minutos \n", duracaoMinutos);
        System.out.printf("Preço da locação: R$ %.2f \n", precoLocacao);
        System.out.printf("Multa por atraso: R$ %.2f \n", multaAtraso);
        System.out.printf("Disponível: %s \n", disponivel ? "Sim" : "Não");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiaLocacao() {
        return diaLocacao;
    }

    public void setDiaLocacao(int diaLocacao) {
        this.diaLocacao = diaLocacao;
    }

    public int getDiaPrevistoDevolucao() {
        return diaPrevistoDevolucao;
    }

    public void setDiaPrevistoDevolucao(int diaPrevistoDevolucao) {
        this.diaPrevistoDevolucao = diaPrevistoDevolucao;
    }

    public int getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(int diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }
}