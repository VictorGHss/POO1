package utfpr.fundamentos.aula11_enumeracoes.exercicio3;

public enum DiaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda"),
    TERCA(3, "terca"),
    QUARTA(4, "quarta"),
    QUINTA(5, "quinta"),
    SEXTA(6, "sexta"),
    SABADO(7, "sabado");

    private int numero;
    private String dia;

    DiaSemana(int numero, String dia) {
        this.numero = numero;
        this.dia = dia;
    }

    public int getNumero() {
        return numero;
    }

    public String getDia() {
        return dia;
    }
}
