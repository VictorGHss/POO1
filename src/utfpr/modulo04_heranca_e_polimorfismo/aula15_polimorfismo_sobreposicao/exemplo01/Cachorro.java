package utfpr.modulo04_heranca_e_polimorfismo.aula15_polimorfismo_sobreposicao.exemplo01;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " au au");
    }

    public void brincar(){
        System.out.println(this.nome + " está brincando");
    }

}
