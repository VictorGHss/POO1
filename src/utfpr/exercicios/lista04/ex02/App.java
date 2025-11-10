package utfpr.exercicios.lista04.ex02;

public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Vinicius Camargo", "123456", "01/01/1990", 23000.00);
        Disciplinas disciplina = new Disciplinas("Programação Orientada a Objetos", 101, 60, Modalidade.PRESENCIAL, professor);

        disciplina.exibirDados();
    }
}
