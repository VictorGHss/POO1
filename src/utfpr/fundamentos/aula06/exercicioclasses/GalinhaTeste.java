package utfpr.fundamentos.aula06.exercicioclasses;

import javax.swing.*;

public class GalinhaTeste {
    public static void main(String[] args) {
        Galinha g1 = new Galinha();
        g1.nomeGalinha = "Sua mãe";
        g1.botar();
        g1.botar();

        Galinha g2 = new Galinha();
        g2.nomeGalinha = "Lais";
        g2.botar();
        g2.botar();
        g2.botar();

        Galinha g3 = new Galinha();
        g3.nomeGalinha = "Marcia";
        g3.botar();
        g3.botar();
        g3.botar();
        g3.botar();
        g3.botar();
        g3.botar();
        g3.botar();

        JOptionPane.showMessageDialog(null, g1.nomeGalinha + " botou " + g1.qntdOvos + " ovos\n");
        JOptionPane.showMessageDialog(null, g2.nomeGalinha + " botou " + g2.qntdOvos + " ovos\n");
        JOptionPane.showMessageDialog(null, g3.nomeGalinha + " botou " + g3.qntdOvos + " ovos\n");
        JOptionPane.showMessageDialog(null, "A granja tem " + Galinha.qntdOvosGranja + " ovos\n");

    }
}
