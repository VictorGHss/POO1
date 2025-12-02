package utfpr.modulo03_relacionamentos_e_estruturas.aula11_enumeracoes.exercicio4;

public enum UF {
    PARANA("PR", "Curitiba"),
    RIO_GRANDE_DO_SUL("RS", "Porto Alegre"),
    SANTA_CATARINA("SC", "Florianópolis"),

    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Belo Horizonte"),
    ESPIRITO_SANTO("ES", "Vitória");


    private String sigla;
    private String capital;

    UF(String sigla, String capital) {
        this.sigla = sigla;
        this.capital = capital;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCapital() {
        return capital;
    }
}
