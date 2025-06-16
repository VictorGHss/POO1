package utfpr.modulo02_principios_poo.aula07_construtor.sobrecarga_metodos;

public class Data {
    int dia;
    int mes;
    int ano;

    // Construtor completo
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor recebendo mês e ano, com dia default 1
    public Data(int mes, int ano) {
        this(1, mes, ano);
    }

    // Construtor recebendo somente o dia, com mês = 1 e ano = 2010
    public Data(int dia) {
        this(dia, 1, 2010);
    }

    // sem parametros
    public Data() {
        this(1, 1, 2010);
    }

    // Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
