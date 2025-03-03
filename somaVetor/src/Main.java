//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] valores = {1, 5, 3, 10, 6};

        int soma = 0;
        for (int valor : valores){
            soma += valor;
        }

        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}