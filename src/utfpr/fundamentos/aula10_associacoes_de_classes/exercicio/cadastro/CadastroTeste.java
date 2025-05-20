package utfpr.fundamentos.aula10_associacoes_de_classes.exercicio.cadastro;

public class CadastroTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua dos bobos", "0", "00000-000", "Arroio dos Ratos", "RS" );
        Pessoa pessoa = new Pessoa ("Renato", "11/09/2001", "Masculino", "Solteiro", endereco);

        pessoa.imprimirDados();
    }
}
