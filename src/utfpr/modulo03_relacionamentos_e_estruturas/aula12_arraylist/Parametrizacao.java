package utfpr.modulo03_relacionamentos_e_estruturas.aula12_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Parametrizacao {

    public static void main(String[] args) {

        List <String> listaDemonios = new ArrayList<>();

        listaDemonios.add("Azathoth");
        listaDemonios.add("Baphomet");
        listaDemonios.add("Julia");
        listaDemonios.add("Lilith");
        listaDemonios.add("Lucifer");

        for (int i = 0; i < listaDemonios.size(); i++) {
            System.out.println(listaDemonios.get(i));
        }
    }
}
