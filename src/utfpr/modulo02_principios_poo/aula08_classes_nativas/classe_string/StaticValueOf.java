package utfpr.modulo02_principios_poo.aula08_classes_nativas.classe_string;

public class StaticValueOf {
    public static void main(String[] args) {

        int numInteiro = 100;
        double numDouble = 50.0;
        boolean variavelBooleana = true;

        String inteiroConvertido = String.valueOf(numInteiro);
        String doubleConvertido = String.valueOf(numDouble);
        String booleanConvertido = String.valueOf(variavelBooleana);

        System.out.println(inteiroConvertido);
        System.out.println(doubleConvertido);
        System.out.println(booleanConvertido);
    }
}
