package utfpr.exercicios.lista04.ex01;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Victor Hass", "26/10/2004", "Masculino", "TI", "42991617187", new Endereco("Belford Roxo", "Rua Cornélio Procópio", 103, "Rio de Janeiro", "RJ"));
        funcionario1.emitirRelatorio();
    }
}
