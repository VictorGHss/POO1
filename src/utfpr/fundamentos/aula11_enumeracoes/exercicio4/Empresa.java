package utfpr.fundamentos.aula11_enumeracoes.exercicio4;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private UF uf;

    public Empresa(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public void imprimirDados(){
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Estado: " + this.uf.name());
        System.out.println("UF: " + this.uf.getSigla());
        System.out.println("Capital da UF: " + this.uf.getCapital());
    }

}
