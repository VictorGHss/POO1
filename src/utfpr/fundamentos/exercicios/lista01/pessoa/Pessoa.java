package utfpr.fundamentos.exercicios.lista01.pessoa;

public class Pessoa {
    String nome;
    String sexo;
    int cpf;
    int idade;
    double altura;
    double peso;

    public void andar() {
        System.out.println(nome + " está andando");
    }

    public void correr() {
        System.out.println(nome + " está correndo");
    }

    public void falar() {
        System.out.println(nome + " está hablando \uD83D\uDDE3\uFE0F");
    }

    public void dormir() {
        System.out.println(nome + " está a mimir \uD83D\uDCA4");
    }

    public void imprimirDados() {
        System.out.println("Informações de Pessoas");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}
