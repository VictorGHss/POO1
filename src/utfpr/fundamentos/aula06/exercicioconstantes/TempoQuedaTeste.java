package utfpr.fundamentos.aula06.exercicioconstantes;

import javax.swing.*;

public class TempoQuedaTeste {
    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog("Digite a altura em metros:");
        double h = Double.parseDouble(altura);
        double tempoQueda = TempoQueda.calcularTempoQueda(h);
        JOptionPane.showMessageDialog(null, "O tempo de queda do objeto em " + altura + " metros de altura é de " + tempoQueda + " segundos.");
    }
}
