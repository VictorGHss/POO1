package utfpr.modulo04_heranca_e_polimorfismo.aula15_polimorfismo_sobreposicao.exemplo01;

public class Gato extends Mamifero {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " miau miau");
    }
}
