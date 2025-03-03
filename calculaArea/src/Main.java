import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        final double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.printf("A = %.1f%n", area);
    }
}