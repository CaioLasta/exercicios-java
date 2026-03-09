import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        float dolar, real;
        final float cambio = 5.23f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em dólares entregues para câmbio");
        dolar = teclado.nextFloat();
        real = dolar * cambio;
        System.out.printf("O valor em reais a ser devolvido é de : R$ %.2f%n",real);
        teclado.close();
    }
}
