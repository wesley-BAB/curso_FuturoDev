package vetor;

import java.util.Scanner;

public class mediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alunos[];
        double medias[];
        double mediaTurma = 0, maiorMedia = 0, menorMedia = 0;


        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = scan.nextInt();
        scan.nextLine();

        alunos = new String[quantidadeAlunos];
        medias = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++){
            System.out.printf("%dº Aluno: ", (i + 1));
            alunos[i] = scan.nextLine();
            System.out.print("Média do aluno: ");
            medias[i] = scan.nextDouble();
            scan.nextLine();

            mediaTurma += medias[i];
        }

        for (int i = 0; i < quantidadeAlunos; i++){
            if(i == 0){
                maiorMedia = medias[i];
                menorMedia = medias[i];
            }

            if(maiorMedia < medias[i]){
                maiorMedia = medias[i];
            }

            if(menorMedia > medias[i]){
                menorMedia = medias[i];
            }
        }

        System.out.printf("Média da turma: %.2f\n", (mediaTurma / quantidadeAlunos));
        System.out.println("Menor Média: " + menorMedia);
        System.out.println("Maior Média: " + maiorMedia);
    }
}
