package utfpr.exercicios.lista07.ex04;

public class TesteLocacao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "Bairro B", "Cidade C", "Estado D", "12345-678");

        Dependente dependente = new Dependente("Rua X", "Bairro Y", "Cidade Z", "Estado W", "87654-321", "Dependente A", "01/01/2000", "(11) 98765-4321", endereco);

        Socio socio = new Socio("Rua 1", "Bairro 2", "Cidade 3", "Estado 4", "12345-678", "Ronaldo", "02/02/1990", "(11) 91234-5678", endereco, "123.456.789-00", dependente);

        Filme filme1 = new Filme("Brokeback Mountain", 180, 15.99, 2.00, socio, 1);
        System.out.println("Sócio: " + socio.getNome());
        System.out.println("Dependente: " + socio.getDependente().getNome());

    }
}
