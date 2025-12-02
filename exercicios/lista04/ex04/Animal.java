package utfpr.exercicios.lista04.ex04;

public class Animal {
    private String nome;
    private int idade;
    private String sexo;
    private Dono dono;
    private Tratamento tratamento;

    public Animal(String nome, int idade, String sexo, Dono dono) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dono = dono;
        this.tratamento = null;
    }

    public void iniciarTratamento(String descricao, String dataInicio) {
        this.tratamento = new Tratamento(descricao, dataInicio);
    }

    public void finalizarTratamento(String dataFim) {
        if (this.tratamento != null) {
            this.tratamento.finalizarTratamento(dataFim);
        }
    }

    public void imprimirRelatorioCompleto() {
        System.out.println("=== Relatório do Animal ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("--- Dono ---");
        System.out.println("Nome: " + dono.getNome());
        System.out.println("CPF: " + dono.getCpf());
        System.out.println("Telefone: " + dono.getTelefone());
        System.out.println("Email: " + dono.getEmail());
        dono.getEndereco().imprimirEndereco();
        if (tratamento != null) {
            tratamento.imprimirTratamento();
        } else {
            System.out.println("--- Tratamento ---");
            System.out.println("Nenhum tratamento registrado.");
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getSexo() { return sexo; }
    public Dono getDono() { return dono; }
    public Tratamento getTratamento() { return tratamento; }
}
