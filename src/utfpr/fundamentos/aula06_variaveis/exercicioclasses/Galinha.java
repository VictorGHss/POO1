package utfpr.fundamentos.aula06_variaveis.exercicioclasses;

public class Galinha {
    String nomeGalinha;
    int qntdOvos = 0;
    static int qntdOvosGranja = 0;

    public void botar(){
        qntdOvos++;
        qntdOvosGranja++;
    }
}
