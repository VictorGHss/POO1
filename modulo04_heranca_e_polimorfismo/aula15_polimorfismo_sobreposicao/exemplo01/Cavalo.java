package utfpr.modulo04_heranca_e_polimorfismo.aula15_polimorfismo_sobreposicao.exemplo01;

public class Cavalo extends Mamifero {

    public Cavalo(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " relincha");
    }

    public void correr() {
        System.out.println(this.nome + " está correndo");
    }
}
