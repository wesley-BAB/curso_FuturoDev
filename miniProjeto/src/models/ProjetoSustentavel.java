package models;

import interfaces.ImpactoAmbiental;

import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    private String nome;
    private String descricao;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Metodo abstrato da interface implementado pelas subclasses
    @Override
    public abstract double calcularImpacto();

    public void adicionarVoluntario(Voluntario voluntario) {
    }
}
