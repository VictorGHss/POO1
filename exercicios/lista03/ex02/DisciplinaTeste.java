package utfpr.exercicios.lista03.ex02;

public class DisciplinaTeste {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina(101, "Programação Orientada a Objetos", "Presencial", 60, "Conceitos de POO, Classes, Objetos, Herança, Polimorfismo");
        Disciplina disciplina2 = new Disciplina(102, "Estruturas de Dados", "Online", 45, "Listas, Pilhas, Filas, Árvores, Grafos");

        System.out.println("=== Disciplina 1 ===");
        disciplina1.exibirRelatorio();
        disciplina1.setConteudoProgramatico("Conceitos de POO, Classes, Objetos, Herança, Polimorfismo, Interfaces");

        System.out.println("=== Disciplina 2 ===");
        disciplina1.setConteudoProgramatico("Listas, Pilhas, Filas, Árvores, Grafos, Algoritmos de Busca e Ordenação");
        disciplina2.exibirRelatorio();
    }
}
