package utfpr.modulo04_heranca_e_polimorfismo.aula13_heranca.exemplo2;

public class CoordenadorCurso extends Professor{
    private Double adicionalSalario;

    public CoordenadorCurso(Integer numRegistro, String nome, String dataNomeacao, Double salario, Double adicionalSalario) {
        super(numRegistro, nome, dataNomeacao, salario);
        this.adicionalSalario = adicionalSalario;
    }

    public void analisarPedidoSegundaChamada(){
        System.out.println(this.nome + " está analisando o pedido da segunda chamada.");
    }

    public void analisarPedidoSuficiencia(){
        System.out.println(this.nome + " está analisando o pedido de suficiência.");
    }

    public void participarReunioesDirecao(){
        System.out.println(this.nome + " está participando de reuniões da direção do curso.");
    }

    public void imprimirDadosCoordenador(){
        super.imprimirDadosProfessor();
        System.out.println("Adicional R$: " + this.adicionalSalario);
        System.out.println("Salário total R$: " + this.calcularSalario());
        System.out.println("-------------------------------");
    }

    private double calcularSalario(){
        return this.salario + this.adicionalSalario;
    }
}
