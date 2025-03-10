package parte01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        User user01 = new User();
        User user02 = new User();
        User user03 = new User("João", "joao@cronimet.com.br", "123");

        ArrayList<User> users = new ArrayList<>();
        //Inserir informações nos objetos
        user01.nome = "Wesley Benevides";
        user01.email = "wesley.bene16@gmail.com";
        user01.password = "123";

        user02.nome = "Marcelo Sombrio";
        user02.email = "marcelo@gmail.com";
        user02.password = "1234";

        users.add(user01);
        users.add(user02);

        System.out.println(user01.details());
        System.out.println(user02.details());

        System.out.println("----- TELA DE LOGIN ----- \n");
        System.out.println("Email: ");
        String email = scan.next();
        System.out.println("Password: ");
        String password = scan.next();

        boolean flaglogin = false;

        for(User user : users){
            if(user.login(email, password)){
                flaglogin = true;
                break;
            }
        }

        System.out.println(flaglogin ? "Seja bem vindo " : "Email ou senha inválidos");

    }


}
