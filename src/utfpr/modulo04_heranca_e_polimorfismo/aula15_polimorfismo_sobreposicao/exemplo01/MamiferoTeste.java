package utfpr.modulo04_heranca_e_polimorfismo.aula15_polimorfismo_sobreposicao.exemplo01;

public class MamiferoTeste {
    public static void main(String[] args) {

        Mamifero mamifero = null;

        int opcao = 2;

        switch (opcao){
            case 1:
                mamifero = new Gato("Morgana", "Preto");
                break;
            case 2:
                mamifero = new Cachorro("Spike ", "Pastor Alemão");
                break;
            case 3:
                mamifero = new Cavalo("Pé de Pano", "Marchador");
                break;
        }
        mamifero.emitirSom();
        if (mamifero instanceof Cachorro){
            ((Cachorro) mamifero).brincar();
        }
    }
}
