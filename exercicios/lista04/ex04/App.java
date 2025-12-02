package utfpr.exercicios.lista04.ex04;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Criando endereço do dono
        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "CidadeX", "PR");
        // Criando dono (sem animal ainda)
        Dono dono = new Dono(null, "João Silva", "123.456.789-00", "(43) 99999-8888", "joao@email.com", endereco);
        // Criando animal e associando ao dono
        Animal animal = new Animal("Rex", 5, "Macho", dono);
        // Associando animal ao dono
        dono.setAnimal(animal);

        // Iniciando tratamento
        animal.iniciarTratamento("Vacinação anual", "30/06/2025");
        // Finalizando tratamento
        animal.finalizarTratamento("02/07/2025");

        // Imprimindo relatório completo
        animal.imprimirRelatorioCompleto();
    }
}
