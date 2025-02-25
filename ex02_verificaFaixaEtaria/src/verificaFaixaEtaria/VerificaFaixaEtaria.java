package verificaFaixaEtaria;

import java.util.Scanner;

public class VerificaFaixaEtaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Digite a sua idade: ");
            int _idade = scan.nextInt();

            if(_idade >= 0 && _idade <=12){
                System.out.println("CRIANÇA");
            }else if(_idade >= 13 && _idade <= 19){
                System.out.println("ADOLESCENTE");
            }else if(_idade >= 20){
                System.out.println("ADULTO");
            }else{
                System.out.println("IDADE INVALIDA");
            }
    }
}
