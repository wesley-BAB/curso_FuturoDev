package planoAcademia;

import java.util.Scanner;

public class planoAcademia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha o nível de condicionamento\n" +
                "1. Iniciante\n" +
                "2. Intermediário\n" +
                "3. Avançado\n" +
                "Digite a opção desejada: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Opção selecionada: Iniciante");
                break;
            case 2:
                System.out.println("Opção selecionada: Intermediário");
                break;
            case 3:
                System.out.println("Opção selecionada: Avançado");
                break;
            default:
                System.out.println("Opção selecionada é inválida");
        }
    }
}
