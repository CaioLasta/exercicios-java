import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int valor1, valor2, soma;

         Scanner teclado = new Scanner(System.in);

         System.out.println("Digite o primeiro número");
         valor1 = teclado.nextInt();

         System.out.println("Digite o segundo número");
         valor2 = teclado.nextInt();

         soma = valor1 + valor2;
         System.out.println("Resultado = " + soma);
         teclado.close();
    }
}
