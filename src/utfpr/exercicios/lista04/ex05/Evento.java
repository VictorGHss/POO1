package utfpr.exercicios.lista04.ex05;

public abstract class Evento {
    //Atributos
    private String nome;
    private Artista artista;
    private String data;
    private Local local;
    private ClassificacaoEtaria classificacaoEtaria;
    private int ingressosDisponiveis;

    //Construtor
    public Evento(String nome, Artista artista, String data, Local local, ClassificacaoEtaria classificacaoEtaria, int ingressosDisponiveis) {
        this.nome = nome;
        this.artista = artista;
        this.data = data;
        this.local = local;
        this.classificacaoEtaria = classificacaoEtaria;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    //Metodos especificos
    public boolean venderIngressos(int quantidade){
        if(quantidade  > 0 && this.ingressosDisponiveis >= quantidade){
            this.ingressosDisponiveis -= quantidade;
            System.out.println("Venda realizada com sucesso!");
            return true;
        } else {
            System.out.println("Venda não realizada. Ingressos insuficientes!");
            return false;
        }
    }

    public abstract void exibirDetalhes();

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ClassificacaoEtaria getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(ClassificacaoEtaria classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }

    public void setIngressosDisponiveis(int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis;
    }
}
