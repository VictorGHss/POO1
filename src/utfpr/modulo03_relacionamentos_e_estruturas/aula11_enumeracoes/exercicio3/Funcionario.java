package utfpr.modulo03_relacionamentos_e_estruturas.aula11_enumeracoes.exercicio3;

public class Funcionario {
    private int registro;
    private String nome;
    private String funcao;
    private String cpf;
    private DiaSemana folga;

    public Funcionario(int registro, String nome, String funcao, String cpf) {
        this.registro = registro;
        this.nome = nome;
        this.funcao = funcao;
        this.cpf = cpf;
    }

    public void setFolga(DiaSemana folga) {
        this.folga = folga;
    }

    public void imprimirRelatorio(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Função: " + this.funcao);
        System.out.println("Número do dia da semana: " + this.folga.getNumero());
        System.out.println("Dia da semana de folga: " + this.folga.getDia());
    }
}
