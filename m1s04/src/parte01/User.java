package parte01;

public class User {

    //Atributos
    String nome;
    String email;
    String password;

    User(){}

    //Construtor parametrizado
    User(String nome, String email, String password){
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    //Métodos
    public String details(){
        return String.format("-----INFORMAÇÕES DO USUÁRIO ----- \n"+
                "Nome do usuário: %s \n" +
                "Email: %s \n" +
                "Senha %s \n", nome, email, password);
    }

    public boolean login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }
}
