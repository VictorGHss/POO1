package utfpr.exercicios.lista04.ex05;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av Vicente Machado", 11, "Centro", "Ponta Grossa", "Paraná");
        Local local = new Local("Sexta às Seis", endereco, 1000);
        Artista artista = new Artista("<Thiago, O Criador>", "Rap", "Thiago, O Criador, rapper, produtor e estilista, fazendo seu primeiro show em ponta grossa");

        Evento[] eventos = new Evento[5];
        eventos[0] = new Show(
                "Turne Chromakopia",
                artista,
                "21-07-2025",
                local,
                ClassificacaoEtaria.DEZOITO_ANOS,
                100
        );

        Evento eventoDaVez = eventos[0];

        eventoDaVez.exibirDetalhes();

        System.out.println("\n--- Realizando vendas ---");

        System.out.println("--- Tentando vender 10 ingressos ---");
        eventoDaVez.venderIngressos(10);
        System.out.println("Ingressos restantes: " + eventoDaVez.getIngressosDisponiveis());

        System.out.println("\nTentando vender 85 ingressos...");
        eventoDaVez.venderIngressos(85);
        System.out.println("Ingressos restantes: " + eventoDaVez.getIngressosDisponiveis());

        System.out.println("\nTentando vender 10 ingressos..."); // é pra dar erro
        eventoDaVez.venderIngressos(10);
        System.out.println("Ingressos restantes: " + eventoDaVez.getIngressosDisponiveis());
    }
}
