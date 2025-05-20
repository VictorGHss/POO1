package utfpr.fundamentos.aula11_enumeracoes.exercicio2;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Victor", "26/10/2004");
        c1.exibirCliente();

        System.out.println("------------------------------");
        c1.setEstadoCivil(EstadoCivil.SOLTEIRO);
        c1.exibirCliente();

        System.out.println("------------------------------");
        c1.setEstadoCivil(EstadoCivil.CASADO);
        c1.exibirCliente();

        System.out.println("------------------------------");
        c1.setEstadoCivil(EstadoCivil.DIVORCIADO);
        c1.exibirCliente();

        System.out.println("------------------------------");
        c1.setEstadoCivil(EstadoCivil.VIÚVO);
        c1.exibirCliente();

    }
}
