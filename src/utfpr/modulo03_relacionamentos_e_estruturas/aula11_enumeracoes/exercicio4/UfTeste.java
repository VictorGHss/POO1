package utfpr.modulo03_relacionamentos_e_estruturas.aula11_enumeracoes.exercicio4;

public class UfTeste {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("UTFPR", "12.345.678/0001-90");
        empresa1.setUf(UF.PARANA);
        empresa1.imprimirDados();

        System.out.println("------------------------------");

        Empresa empresa2 = new Empresa("Google", "12.345.678/0001-90");
        empresa2.setUf(UF.SAO_PAULO);
        empresa2.imprimirDados();

        System.out.println("------------------------------");

        Empresa empresa3 = new Empresa("Facebook", "12.345.678/0001-90");
        empresa3.setUf(UF.MINAS_GERAIS);
        empresa3.imprimirDados();
    }
}
