package utfpr.fundamentos.aula08_classes_nativas.classe_string;

public class Trim {
    public static void main(String[] args) {

        String alfabeto = "       abcdefghijklmnopqrstuvwxyz      ";

        System.out.println("<<" + alfabeto + ">>");
        System.out.println("<<" + alfabeto.trim() + ">>");
    }
}
