package utfpr.fundamentos.aula08_classes_nativas.classe_wrapper;

import java.util.Date;

public class Pessoa {
    private Integer codigo;
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private String estadoCivil;
    private Double altura;
    private Double peso;
    private Boolean status;

    public Pessoa(Integer codigo, String nome, Date dataNascimento, String sexo, String estadoCivil, Double altura, Double peso, Boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
        this.status = status;
    }

    public Integer getCodigo(){
        return codigo;
    }
}
