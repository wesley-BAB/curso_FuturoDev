import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz  = new int[3][3];

        // Preencher a matriz com números aleatórios usando biblioteca random
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // Imprimir a matriz
        System.out.println("Matriz aleatória:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrar o elemento com o maior valor
        int maiorValor = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Imprimir o maior valor
        System.out.println("O maior valor na matriz é: " + maiorValor);

    }
}