package utfpr.modulo02_principios_poo.aula07_construtor.sobrecarga_metodos;

public class DataTeste {
    public static void main(String[] args) {
        // Instanciando a classe Data com dia, mês e ano
        Data data1 = new Data(15, 8, 2023);
        System.out.println(data1.toString());

        // Instanciando a classe Data com mês e ano
        Data data2 = new Data(8, 2023);
        System.out.println(data2.toString());

        // Instanciando a classe Data com apenas o dia
        Data data3 = new Data(15);
        System.out.println(data3.toString());

        // Instanciando a classe Data sem parâmetros
        Data data4 = new Data();
        System.out.println(data4.toString());
    }
}
