import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scan.nextLine();
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.print("Digite o valor hora do funcionário: ");
        double valorHora = scan.nextDouble();

        double salario = horasTrabalhadas*valorHora;

        System.out.printf("O funcionário " + nomeFuncionario +
                      " trabalhou " + horasTrabalhadas +
                      " horas, e portanto possui R$"+ salario + " a receber");

    }
}