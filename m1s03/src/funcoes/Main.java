package funcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();

        System.out.println(numeroPar(numero) == true ? "O numero é par." : "O numero não é par");

        String[] nomes = {"Wesley", "Marcelo", "Flaviano", "João"};
        visualizarVetor(nomes);
    }

    public static boolean numeroPar(int numero){
        return numero % 2 == 0;
    };

    public static void visualizarVetor(String[] vars){
        for(String var : vars){
            System.out.println(var);
        }

    }
}
