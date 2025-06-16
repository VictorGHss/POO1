package utfpr.fundamentos.aula15_polimorfismo_sobreposicao.exemplo01;

public class Mamifero {
    protected String nome;
    protected String raca;

    public Mamifero(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public Mamifero() {
    }

    public void emitirSom(){
        System.out.println(this.nome + " ");
    }
}
