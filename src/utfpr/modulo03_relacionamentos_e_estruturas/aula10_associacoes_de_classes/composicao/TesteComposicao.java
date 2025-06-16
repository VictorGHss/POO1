package utfpr.modulo03_relacionamentos_e_estruturas.aula10_associacoes_de_classes.composicao;

public class TesteComposicao {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Victor Gabriel", "Rua da pica", "Rio Glande do Sul", "73127-746");
        Pessoa pessoa2 = new Pessoa("Ana Clara", "Rua das Flores, 123", "Curitiba", "80000-000");
        Pessoa pessoa3 = new Pessoa("Bruno Silva", "Av. Brasil, 456", "Londrina", "86000-000");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
