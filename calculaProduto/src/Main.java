import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorFixo1 = 3;
        int valorFixo2 = 9;
        int valorFinal = valorFixo1*valorFixo2;

        System.out.println("O valor do produto final é: "+ valorFinal);
        System.out.println("\n---------------------\n Vamos tentar o valor de outro produto?\n");

        System.out.println("Digite o primeiro valor inteiro: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int valor2 = scan.nextInt();

        int produto = valor1 * valor2;

        System.out.println("O produto é: " + produto);
    }
}