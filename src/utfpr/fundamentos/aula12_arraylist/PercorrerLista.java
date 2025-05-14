package utfpr.fundamentos.aula12_arraylist;

import java.util.ArrayList;
import java.util.List;

public class PercorrerLista {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcinho vp", 52, 65.4);
        Pessoa p2 = new Pessoa("Elias Maluco", 42, 73.9);
        Pessoa p3 = new Pessoa("Pedrinho Matador", 61, 61.7);

        List<Pessoa> listaPessoasDeBem = new ArrayList<>();

        listaPessoasDeBem.add(p1);
        listaPessoasDeBem.add(p2);
        listaPessoasDeBem.add(p3);

        for (int i = 0; i < listaPessoasDeBem.size(); i++) {

            Pessoa pessoa = listaPessoasDeBem.get(i);

            System.out.println("❤\uFE0F❤\uFE0F❤\uFE0F Listando Pessoas de bem! ❤\uFE0F❤\uFE0F❤\uFE0F");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Peso: " + pessoa.getPeso());
        }
    }
}
