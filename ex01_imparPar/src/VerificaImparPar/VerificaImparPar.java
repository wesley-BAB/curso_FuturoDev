package VerificaImparPar;

import java.util.Scanner;

public class VerificaImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        if(numero % 2 == 0){
            System.out.println("Número PAR!");
        }else{
            System.out.println("Número IMPAR!");
        }

        //OPERADOR TERNÁRIO
        System.out.println(numero %2 == 0 ? "Número PAR!" : "Número ÍMPAR!");
    }
}
