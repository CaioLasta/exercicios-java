import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        String nome;
        float horasTrabalhadas, dependentes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário");
        nome = teclado.next();
        System.out.println("Insira a quatidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextFloat();
        System.out.println("Insira o número de dependentes do funcionário");
        dependentes = teclado.nextFloat();
        float salarioTrabalho = horasTrabalhadas*10;
        float salarioFamilia = dependentes*60;
        float salarioBruto = salarioTrabalho+salarioFamilia;
        float salarioliquido = salarioTrabalho*0.865f+salarioFamilia;
        System.out.println("O funcionário "+nome+" tem o salário bruto de R$"+salarioBruto+" e o salário líquido de R$"+salarioliquido);
        teclado.close();
    }
}
