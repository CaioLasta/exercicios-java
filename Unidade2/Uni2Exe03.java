import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o raio");
        raio = teclado.nextDouble();
        double circunferencia = Math.pow(raio, 2) * Math.PI;
        System.out.println("Circunferência = " + circunferencia);
        teclado.close(); 
    }
}
