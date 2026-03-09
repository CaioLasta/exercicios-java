import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        float numeroFuncionario, horasTrabalhadas, valorHora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número do funcionário");
        numeroFuncionario = teclado.nextFloat();
        System.out.println("Insira a quantidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextFloat();
        System.out.println("Insira o valor ganho por hora trabalhada");
        valorHora = teclado.nextFloat();
        float salario = horasTrabalhadas*valorHora;
        System.out.printf("O funcionário nº "+numeroFuncionario+" ganha um salário de: R$ %.2f%n", salario);
        teclado.close();
    }
}
