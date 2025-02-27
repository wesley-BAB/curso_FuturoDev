package initial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Declaração de variavel e constante
        byte number1 = 1; //8 bits
        short number2 = 2; //16 bits
        int number3 = 3; //32 bits
        long number4 = 4; //64 bits

        double decimal1 = 3.14; //32 bits
        float decimal2 = 1.0f; //64 bits

        char sexo = 'M';

        boolean ativo = false;

        final double pi = 3.14;

        //OPERADORES
        int idade = 15;
        boolean habilitato = false;

        ENTRADA DE DADOS, PROCESSAMENTO, SAIDA DE DADOS



        //String
        scan.next(); // captura até o espaço
        scan.nextLine(); // caputar até o Enter
        scan.nextInt(); // captura mumeros inteiros
        scan.nextDouble(); // captura numeros decimais
        scan.nextFloat(); //captura numeros decimais
        scan.nextBoolean(); //captura teste logico



        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastro de usuario \n Digite Nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.println("Digite a sua idade Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu Endereço: ");
        String endereco = scan.nextLine();

        //System.out.println("Nome: " + nomeCompleto + "\nIdade: " + idade + "\nEndereço: " + endereco);

        System.out.println("RELATÓRIO DO USUÁRIO\n");
        System.out.printf("Nome Completo: %s\nIdade: %d\nEndereço: %s\n", nomeCompleto, idade, endereco);

        //%i - Inteiros
        //%s - String
        //%f - Decimais
        //%c - Caracter único

        if(idade >= 18)
            System.out.println("Usuário maior de idade");
            //Não pode uar mais de uma linha sem as chaves
        else
            System.out.println("Usuário menor de idade");


        boolean conexaoBanco = true;

        if(conexaoBanco){
            System.out.println("Conexão estabelecida");
        }


         */

        //ESTRUTURA DE ESCOLHA
        int valor = 5;

        switch (valor){
            case 1:
                System.out.println("O valor é 1");
                break;
            case 5:
                System.out.println("O valor é 5");
                break;
            default:
                System.out.println("Valor inesperado");
        }

        //LAÇO DE REPETIÇÃO
        int cont = 0;
        while(cont < 5){
            System.out.println("Estou em execução " + cont);
            cont++;
        }
        System.out.println("\n");


        int contador = 0;
        while(true){
            System.out.println("Estou em execução " + contador);
            contador++;

            if(contador == 5){
                break;
            }
        }

        do{
            System.out.println("Estou em execução");
        }while(false);

        int contador1 = 10;
        for(int i = 0; i<contador1; i++){
            System.out.println("executando o for, valor de i=" + i);
        }
    }
}

