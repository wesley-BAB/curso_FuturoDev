//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] valores = {1, 5, 3, 10, 6};

        int soma = 0;
        for (int valor : valores){
            soma += valor;
        }

        int media = soma / valores.length;

        System.out.printf("o cálculo é feito com a soma total do array = %d dividido pelo numero de posições do array = %d", soma, valores.length);
        System.out.println();
        System.out.println("A média do vetor é: " + media);
    }
}