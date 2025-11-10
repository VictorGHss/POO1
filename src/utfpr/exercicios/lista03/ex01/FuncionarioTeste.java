package utfpr.exercicios.lista03.ex01;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "João Silva", "1990-01-01", "Masculino", "TI", "1234-5678", "Rua A, 123");
        Funcionario funcionario2 = new Funcionario(2, "Maria Oliveira", "1985-05-05", "Feminino", "RH", "9876-5432", "Rua B, 456");

        System.out.println("=== Funcionario 1 ===");
        System.out.println(funcionario1.emitirRelatorio());
        System.out.println("\n=== Funcionario 2 ===");
        System.out.println(funcionario2.emitirRelatorio());

        System.out.println("\n=== Atualizando dados do Funcionario 1 ===");
        funcionario1.setTelefone("1111-2222");
        funcionario1.setSetor("Desenvolvimento");
        System.out.println("\n=== Funcionario 1 (dados atualizados) ===");
        System.out.println(funcionario1.emitirRelatorio());

        System.out.println("\n=== Atualizando setor do Funcionario 2 ===");
        funcionario2.setSetor("Financeiro");
        System.out.println("\n=== Funcionario 2 (setor atualizado) ===");
        System.out.println(funcionario2.emitirRelatorio());
    }
}
