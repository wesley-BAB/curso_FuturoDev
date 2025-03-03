import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maça");
        lista.add("Banana");
        lista.add("Laranja");

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = scan.next().charAt(0);

        // Criar uma nova ArrayList para armazenar as Strings filtradas
        ArrayList<String> filtradas = new ArrayList<>();
        for (String s : lista) {
            if (s.length() > 0 && s.charAt(0) == caractere) {
                filtradas.add(s);
            }
        }

        // Imprimir a lista filtrada
        System.out.println("Strings que começam com '" + caractere + "': " + filtradas);
    }
}