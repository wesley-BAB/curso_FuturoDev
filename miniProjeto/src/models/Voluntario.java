package models;

public class Voluntario {
    //Definição de atributos
    public String nome;
    public String email;

    // Construtor da classe, inicializando os atributos
    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Metodo para o voluntário participar de um projeto sustentável
    public void participarProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }

    // Metodos getter e setter para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
