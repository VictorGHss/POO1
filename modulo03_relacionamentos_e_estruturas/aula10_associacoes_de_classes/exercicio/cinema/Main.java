package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.exercicio.cinema;

// Main.java (Exemplo de uso)
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Criar Atores
        Ator ator1 = new Ator("Leonardo DiCaprio");
        Ator ator2 = new Ator("Kate Winslet");

        // 2. Criar Gêneros
        Genero romance = new Genero("Romance");
        Genero drama = new Genero("Drama");
        romance.cadastrar();

        // 3. Criar Filme e associar Atores e Gêneros
        Filme titanic = new Filme("Titanic", 195);
        titanic.adicionarAtor(ator1);
        titanic.adicionarAtor(ator2);
        titanic.adicionarGenero(romance);
        titanic.adicionarGenero(drama);
        titanic.cadastrar();

        System.out.println("\nDetalhes do Filme:");
        System.out.println(titanic);

        // 4. Criar Sala
        Sala sala1 = new Sala(1, 150);
        sala1.cadastrar();

        // 5. Criar Sessão
        Sessao sessaoTitanic = new Sessao(new Date(), "20:00", sala1, titanic);
        sessaoTitanic.cadastrar();

        // 6. Gerar Ingresso para a Sessão
        double valorCheioIngresso = 30.00;
        sessaoTitanic.gerarIngressos(valorCheioIngresso);

        System.out.println("\nDetalhes da Sessão:");
        System.out.println(sessaoTitanic);

        // 7. Vender alguns ingressos
        System.out.println("\nVendendo Ingresso:");
        if (!sessaoTitanic.getIngressos().isEmpty()) {
            sessaoTitanic.getIngressos().get(0).venderIngresso();
            sessaoTitanic.getIngressos().get(4).venderIngresso();
            sessaoTitanic.getIngressos().get(0).venderIngresso();
        }

        System.out.println("\nStatus da Sessão após vendas:");
        System.out.println(sessaoTitanic);

    }
}
