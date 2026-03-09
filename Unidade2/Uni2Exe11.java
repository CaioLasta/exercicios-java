
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor A");
        a = teclado.nextFloat();
        System.out.println("Insira o valor B");
        b = teclado.nextFloat();
        System.out.println("Insira o valor C");
        c = teclado.nextFloat();
        System.out.printf("A área do triângulo é: %.2f%n", (a*c)/2);
        System.out.printf("A área do circulo é: %.2f%n", Math.pow(c, 2)*Math.PI);
        System.out.printf("A área do trapézio é: %.2f%n", ((a+b)*c)/2);
        System.out.printf("A área do quadrado é: %.2f%n", b*b);
        System.out.printf("A área do retângulo é: %.2f%n", a*b);
        teclado.close();
    }
}
