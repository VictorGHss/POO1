package utfpr.fundamentos.aula10_associacoes_de_classes.associacao_binaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos;
    private List<ContratoAluguel> contratos;
    private String nome;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
        this.contratos = new ArrayList<>();

        adicionarVeiculo(new Veiculo("Fusca", "Volkswagen", 1970, "ABC-1234", 80.0));
        adicionarVeiculo(new Veiculo("Civic", "Honda", 2020, "XYZ-5678", 150.0));
        adicionarVeiculo(new Veiculo("Corolla", "Toyota", 2021, "LMN-9101", 180.0));
        adicionarVeiculo(new Veiculo("Palio", "Fiat", 2015, "DEF-2345", 100.0));
    }

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria("AutoRent");
        
        System.out.println("=== Listando todos os veículos iniciais ===");
        concessionaria.listarVeiculos();

        System.out.println("\n=== Alugando um veículo ===");
        ContratoAluguel contrato1 = concessionaria.alugarVeiculo("XYZ-5678", "João Silva", 1, 5);

        System.out.println("\n=== Listando veículos após aluguel ===");
        concessionaria.listarVeiculos();

        System.out.println("\n=== Alugando outro veículo ===");
        ContratoAluguel contrato2 = concessionaria.alugarVeiculo("LMN-9101", "Maria Oliveira", 2, 7);

        System.out.println("\n=== Tentando alugar um veículo já alugado ===");
        ContratoAluguel contratoInvalido = concessionaria.alugarVeiculo("XYZ-5678", "Pedro Santos", 3, 8);

        System.out.println("\n=== Devolvendo o primeiro veículo ===");
        concessionaria.devolverVeiculo(contrato1.getNumContrato(), 6);

        System.out.println("\n=== Listando veículos após devolução ===");
        concessionaria.listarVeiculos();

        System.out.println("\n=== Alugando o veículo que foi devolvido ===");
        ContratoAluguel contrato3 = concessionaria.alugarVeiculo("XYZ-5678", "Ana Pereira", 7, 10);

        System.out.println("\n=== Listando veículos finais ===");
        concessionaria.listarVeiculos();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }

    public List<Veiculo> listarVeiculosDisponiveis() {
        List<Veiculo> disponiveis = new ArrayList<>();
        for (Veiculo v : veiculos) {
            if (v.isDisponivel()) {
                disponiveis.add(v);
            }
        }
        return disponiveis;
    }

    public ContratoAluguel alugarVeiculo(String placa, String nomeCliente, int dataLocacao, int dataDevolucao) {
        Veiculo veiculo = buscarVeiculoPorPlaca(placa);

        if (veiculo != null && veiculo.isDisponivel()) {
            ContratoAluguel contrato = new ContratoAluguel(0, veiculo.getValorDiaria(), nomeCliente, dataLocacao, dataDevolucao, veiculo);
            contrato.alugarVeiculo();
            contratos.add(contrato);
            return contrato;
        } else {
            System.out.println("Veículo não encontrado ou não disponível para aluguel.");
            return null;
        }
    }

    public void devolverVeiculo(int numContrato, int dataDevolucao) {
        for (ContratoAluguel contrato : contratos) {
            if (contrato.getNumContrato() == numContrato) {
                contrato.devolverVeiculo(dataDevolucao);
                return;
            }
        }
        System.out.println("Contrato não encontrado.");
    }

    public void listarVeiculos() {
        System.out.println("\n=== Veículos da " + nome + " ===");
        for (Veiculo v : veiculos) {
            System.out.println(v.getMarca() + " " + v.getModelo() + " (" + v.getPlaca() + ") - Ano: " + v.getAno() + 
                " - Diária: R$ " + v.getValorDiaria() + " - " + (v.isDisponivel() ? "Disponível" : "Alugado"));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
