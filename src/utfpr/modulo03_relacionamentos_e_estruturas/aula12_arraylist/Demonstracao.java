package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demonstracao {

    public static void main(String[] args) {

        List listaGenerica = new ArrayList();

        listaGenerica.add("Azathoth");
        listaGenerica.add("Baphomet");
        listaGenerica.add("Julia");

        for(int i = 0; i < listaGenerica.size(); i++){
            System.out.println(listaGenerica.get(i));
        }
    }
}
