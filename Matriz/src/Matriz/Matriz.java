package matriz;

public class Matriz {
    public static void main(String[] args) {
        int[][] valores = new int[2][3];

        String[][] matriz = {
                {"A", "B", "C"},
                {"1", "2", "3"},
                {"X", "Y", "Z"},
        };

        System.out.println("Quantidade de Linhas: " + valores.length);
        System.out.println("Quantidade de colunas: " + valores[0].length);

        /*
            (0,0)(0,1)(0,2)
            (1,0)(1,1)(1,2)
         */

        valores[1][1] = 10;

        System.out.println("Valor Armazenado: " + valores[1][1]);

        //PERCORRENDO MATRIZ
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
