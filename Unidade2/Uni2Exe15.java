import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        float n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m05, m01;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em R$");
        float valor = teclado.nextFloat();
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
        valor = valor%2;
        m1 = valor;
        valor = (valor%1)*100;
        m50 = valor/50;
        valor = valor%50;
        m25 = valor/25;
        valor = valor%25;
        m10 = valor/10;
        valor = valor%10;
        m05 = valor/5;
        valor = valor%5;
        m01 = valor;

        System.out.println("As notas necessárias são:");
        System.out.println("100R$: "+Math.floor(n100));
        System.out.println("50R$: "+Math.floor(n50));
        System.out.println("20R$: "+Math.floor(n20));
        System.out.println("10R$: "+Math.floor(n10));
        System.out.println("5R$: "+Math.floor(n5));
        System.out.println("2R$: "+Math.floor(n2));
        System.out.println();
        System.out.println("As moedas necessárias são:");
        System.out.println("1R$: "+Math.floor(m1));
        System.out.println("0,50R$: "+Math.floor(m50));
        System.out.println("0,25R$: "+Math.floor(m25));
        System.out.println("0,10R$: "+Math.floor(m10));
        System.out.println("0,05R$: "+Math.floor(m05));
        System.out.println("0,01R$: "+Math.floor(m01));
        teclado.close();
    }
}
