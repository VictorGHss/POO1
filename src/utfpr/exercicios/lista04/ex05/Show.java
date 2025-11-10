package utfpr.exercicios.lista04.ex05;

public class Show extends Evento{
    private String generoMusical;

    public Show(String nome, Artista artista, String data, Local local, ClassificacaoEtaria classificacaoEtaria, int ingressosDisponiveis) {
        super(nome, artista, data, local, classificacaoEtaria, ingressosDisponiveis);
        this.generoMusical = generoMusical;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Show ---");
        System.out.println("Evento: " + this.getNome());
        System.out.println("Gênero: " + this.generoMusical);
        System.out.println("Artista: " + this.getArtista().getNome());
        System.out.println("Data: " + this.getData());
        System.out.println("Local: " + this.getLocal().getNomeLocal());
        System.out.println("Classificação etária: " + this.getClassificacaoEtaria());
        System.out.println("Ingressos disponíveis: " + this.getIngressosDisponiveis());
    }
}
