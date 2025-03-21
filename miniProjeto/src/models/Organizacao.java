package models;

import java.util.ArrayList;

public class Organizacao {
    //Definição de atributos
    public String nome;
    ArrayList<ProjetoSustentavel> listaProjetos = new ArrayList<>();

    // Construtor da classe, inicializando os atributos
    public Organizacao(String nome) {
        this.nome = nome;
    }

    // Metodo para adicionar um projeto à lista de projetos da organização
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        this.listaProjetos.add(projeto); //
    }

    // Metodo para listar todos os projetos da organização
    public void listarProjetos() {
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("Projeto: " + projeto.getNome());
        }
    }
}
