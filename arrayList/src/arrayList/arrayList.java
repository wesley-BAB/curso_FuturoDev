package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println(numeros.size());

        //ADICIONAR VALORES
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        System.out.println(numeros.size());

        //CAPTURA VALOR POR POSICAO
        System.out.println("Qual posição deseja caputar? ");
        int posicao = scan.nextInt();
        System.out.printf("Valor da posição %d é %d ", posicao, numeros.get(posicao-1));

        //REMOVE VALOR
        System.out.println("\nQual posição deseja Remover? ");
        posicao = scan.nextInt();
        System.out.printf("O Valor %d da posição %d foi removido", numeros.get(posicao-1), posicao);
        numeros.remove(posicao-1);

        //VERIFICAR VALORES CONTIDOS NA LISTA
        System.out.println("\nQual valor a ser procurado: ");
        int valor = scan.nextInt();
        System.out.println(numeros.contains(valor) ? "Valor encontrado "  : "Valor não encontrado");

        for (Integer numero : numeros){
            System.out.println(numero + "\t");
        }
    }
}
