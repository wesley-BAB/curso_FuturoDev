package initial;

import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        double notas[] = new double[3];

        Scanner scan = new Scanner(System.in);

        //FOR CONVENCIONAL
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Digite a Nota  " + (i+1) + ":");
            notas[i] = scan.nextDouble();
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        //FOR EACH
        int indice = 1;
        for(double nota : notas){
            System.out.println("Nota " + indice + " foreach: "+nota);
            indice++;
        }

    }
}


