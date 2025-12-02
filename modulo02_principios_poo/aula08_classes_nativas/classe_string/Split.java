package utfpr.modulo02_principios_poo.aula08_classes_nativas.classe_string;

public class Split {
    public static void main(String[] args) {

        String universidade = "Universidade Tecnológica Federal do Paraná";

        String [] stringDividida = universidade.split(" ");

        for(String s : stringDividida){
            System.out.println(s);
        }
    }
}
