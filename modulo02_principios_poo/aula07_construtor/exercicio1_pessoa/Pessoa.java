package utfpr.modulo02_principios_poo.aula07_construtor.exercicio1_pessoa;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void andar(){
        System.out.println(nome + " está andando");
    }

    public void correr(){
        System.out.println(nome + " está correndo");
    }

    public void falar(){
        System.out.printf(nome + " está hablando \uD83D\uDDE3\uFE0F");
    }
    public void imprimirDados(){
        System.out.println("===== Pessoinhas =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("---------------------------");
    }
}
