package utfpr.modulo02_principios_poo.aula08_classes_nativas.classe_string;

public class Equals {
    public static void main(String[] args) {
        String saudacao = "Olá";
        String s1 = "Olá";

        if(s1.equals(saudacao)){
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }
    }
}
