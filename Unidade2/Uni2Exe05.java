import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int a, b, c, d, diferença;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor A");
        a = teclado.nextInt();
        System.out.println("Insira o valor B");
        b = teclado.nextInt();
        System.out.println("Insira o valor C");
        c = teclado.nextInt();
        System.out.println("Insira o valor D");
        d = teclado.nextInt();
        diferença = a*b-c*d;
        System.out.println("A diferença dos produtos é: "+diferença);
        teclado.close();
    }
}
