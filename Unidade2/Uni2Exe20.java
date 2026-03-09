import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número de dobras no papel");
        double dobras = teclado.nextDouble();
        if (dobras%2 == 0) {
            System.out.println("O número de quadrados após as dobras será: "+Math.floor(Math.pow(2, dobras)));
        } else {
            System.out.println("O número de dobras deve ser par");
        }
        teclado.close();
    }
}
