package utfpr.exercicios.lista01.ex02;

public class Pessoa {
    private String nome;
    private String sexo;
    private Long cpf;
    private int idade;
    private int altura;
    private double peso;

    public Pessoa(String nome, String sexo, Long cpf, int idade, int altura, double peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void andar(){
        System.out.println(nome + " está andando.");
    }

    public void correr(){
        System.out.println(nome + " está correndo.");
    }

    public void falar(String mensagem){
        System.out.println(nome + " diz: " + mensagem);
    }

    public void dormir(){
        System.out.println(nome + " está dormindo💤💤💤");
    }

    public void imprimirDados(){
        System.out.println("--- Informações da Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
    }
}
