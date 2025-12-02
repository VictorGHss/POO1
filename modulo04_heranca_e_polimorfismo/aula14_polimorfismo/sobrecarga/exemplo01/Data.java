package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.sobrecarga.exemplo01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    private String data;

    public void atribuirData() {
        Date hoje = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.data = df.format(hoje);
    }

    public void atribuirData(String data) {
        this.data = data;
    }

    public void atribuirData(int dia, int mes, int ano) {
        this.data = dia + "/" + mes + "/" + ano;
    }

    public void exibirData() {
        System.out.println("Data: " + this.data);
    }

}
