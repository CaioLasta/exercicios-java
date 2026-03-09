import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int valor1, valor2, produto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o primeiro número");
        valor1 = teclado.nextInt();
        System.out.println("Insira o segundo número");
        valor2 = teclado.nextInt();

        produto = valor1 * valor2;
        System.out.println("O produto é: " + produto);
        teclado.close();
    }
}
