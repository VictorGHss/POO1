package utfpr.exercicios.lista04.ex05;

public enum ClassificacaoEtaria {
    LIVRE("Livre para todos os públicos."),
    DEZ_ANOS("Não recomendado para menores de 10 anos."),
    DOZE_ANOS("Não recomendado para menores de 12 anos."),
    QUATORZE_ANOS("Não recomendado para menores de 14 anos."),
    DEZESSEIS_ANOS("Não recomendado para menores de 16 anos."),
    DEZOITO_ANOS("Não recomendado para menores de 18 anos.");

    private final String descricao;

    ClassificacaoEtaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}