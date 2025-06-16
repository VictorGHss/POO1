package utfpr.modulo04_heranca_e_polimorfismo.aula14_polimorfismo.coercao.tiposobjetos;

import java.util.Scanner;

public class ImovelTeste extends Imovel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Imovel imovel = null;

        System.out.println("1 - Imóvel Novo");
        System.out.println("2 - Imóvel Usado");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        switch (opcao) {

            case 1:
                // coerção implícita
                imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
                break;

            case 2:
                // coerção implícita
                imovel = new ImovelUsado("Balduíno Taques, 2048", 500000.00, 100000.00);
                break;
        }

        imovel.imprimirDados();

        System.out.println("===========================");

        if (imovel instanceof ImovelNovo) {

            // coerção explícita
            ImovelNovo imovelNovo = (ImovelNovo) imovel;
            imovelNovo.imprimirDados();
        }
    }
}
