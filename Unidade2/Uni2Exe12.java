
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor do eixo x do ponto 1");
        x1 = teclado.nextDouble();
        System.out.println("Insira o valor do eixo y do ponto 1");
        y1 = teclado.nextDouble();
        System.out.println("Insira o valor do eixo x do ponto 2");
        x2 = teclado.nextDouble();
        System.out.println("Insira o valor do eixo y do ponto 2");
        y2 = teclado.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.printf("A distância entre os dois pontos é: %.4f%n",distancia);
        teclado.close();
    }
}
