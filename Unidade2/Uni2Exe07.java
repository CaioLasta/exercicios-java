import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        String nome;
        float salarioFixo, vendas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome do vendedor");
        nome = teclado.next();
        System.out.println("Insira o salário fixo do vendedor");
        salarioFixo = teclado.nextFloat();
        System.out.println("Insira o valor, em reais, de vendas efetuadas");
        vendas = teclado.nextFloat();
        float salarioTotal = salarioFixo+vendas*0.15f;
        System.out.printf("O salário total do vendedor "+nome+" é: R$ %.2f%n", salarioTotal);
        teclado.close();
    }
}
