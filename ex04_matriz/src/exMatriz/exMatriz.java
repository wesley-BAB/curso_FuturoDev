package exMatriz;

public class exMatriz {
    public static void main(String[] args) {

        Integer[][] matriz = {
                {10, 9, 8, 7, 6},
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {10, 10, 10, 9, 10},
                {5, 7, 5, 5, 5}
        };

        //PERCORRENDO MATRIZ
        int somaLinha = 0;
        int somaColuna = 0;
        int somaImpar = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                somaLinha += matriz[linha][coluna];
                somaColuna += matriz[coluna][linha];
                int temp = (matriz[linha][coluna]);

                if(temp % 2 != 0){
                    somaImpar += temp;
                }
            }

            System.out.println("Soma da linha "+ (linha+1) +": " + somaLinha);
            System.out.println("Soma da coluna "+ (linha+1) +": " + somaColuna);


            System.out.println();

            somaColuna = 0;
            somaLinha = 0;
        }

        System.out.println("Soma dos números Impares: " + somaImpar);

    }
}

