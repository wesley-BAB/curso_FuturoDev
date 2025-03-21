package models;

public class Empresa extends Organizacao {
    //Definição de Atributos
    private String cnpj;

    //Construtor da clase empresa
    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }
}
