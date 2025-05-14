package utfpr.fundamentos.exercicios.lista05.estacionamento;

public class EstacionamentoTeste {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        // Estacionar Veiculos
        estacionamento.estacionar("Chevette", "XXT-1010", "Prata", "Rubens", 8);
        estacionamento.estacionar("Corolla", "CCX-2028", "Preto", "Josualdo", 18);

        // Retirar Veiculos
        estacionamento.retirar("CCX-2028", 21);

        // Estacionando mais veiculos
        estacionamento.estacionar("Celta", "COC-4012", "Vermelho", "Ana", 11);
        estacionamento.estacionar("Fusca", "FUS-1234", "Preto", "Tião", 16);

        // Tentar retirar um veiculo que nao existe
        estacionamento.retirar("SPO-1249", 12);

        // Tentar estacionar quando o estacionamento esta lotado
        estacionamento.estacionar("Mobi", "OPT-1248", "Branco", "Fernanda", 7);
        estacionamento.estacionar("Palio", "PAL-6421", "Prata", "Murilo", 9);

        //Retirar mais um veiculo
        estacionamento.retirar("PAL-6421", 19);


    }
}
