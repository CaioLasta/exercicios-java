
import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int n100, n50, n20, n10, n5, n2, n1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em R$");
        int valor = teclado.nextInt();
        n100 = valor/100;
        valor = valor%100;
        n50 = valor/50;
        valor = valor%50;
        n20 = valor/20;
        valor = valor%20;
        n10 = valor/10;
        valor = valor%10;
        n5 = valor/5;
        valor = valor%5;
        n2 = valor/2;
        n1 = valor%2;
        System.out.println("As notas necessárias são: "+n100+" notas de R$100, "+n50+" notas de R$50, "+n20+" notas de 20R$, "+n10+" notas de 10R$, "+n5+" notas de 5R$, "+n2+" notas de 2R$ e "+n1+" moedas de 1R$");
        teclado.close();
    }
}
