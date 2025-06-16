package utfpr.fundamentos.aula13_heranca.exemplo2;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor(1, "Ronaldo", "Matemática", 4000.00);
        professor1.imprimirDadosProfessor();
        professor1.aplicarAvaliacao();
        professor1.lancarFrequencia();

        System.out.println("=============================");

        CoordenadorCurso coordenador1 = new CoordenadorCurso(2, "Maria", "Ciências", 4000.00, 1000.00);
        coordenador1.imprimirDadosCoordenador();
        coordenador1.aplicarAvaliacao();
        coordenador1.lancarFrequencia();
        coordenador1.analisarPedidoSegundaChamada();
        coordenador1.analisarPedidoSuficiencia();
        coordenador1.participarReunioesDirecao();
    }
}
