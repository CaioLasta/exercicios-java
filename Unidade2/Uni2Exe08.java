import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        float precoP1, numeroP1, precoP2, numeroP2;
        int codigoP1, codigoP2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o código da peça 1");
        codigoP1 = teclado.nextInt();
        System.out.println("Insira o preço unitário da peça 1");
        precoP1 = teclado.nextFloat();
        System.out.println("Insira o número de peças 1");
        numeroP1 = teclado.nextFloat();
        System.out.println("Insira o código da peça 2");
        codigoP2 = teclado.nextInt();
        System.out.println("Insira o preço unitário da peça 2");
        precoP2 = teclado.nextFloat();
        System.out.println("Insira o número de peças 2");
        numeroP2 = teclado.nextFloat();
        float valortotal = numeroP1*precoP1+numeroP2*precoP2;
        System.out.printf("O valor total da peça 1, código "+codigoP1+", é: R$ %.2f%n",numeroP1*precoP1);
        System.out.printf("O valor total da peça 2, código "+codigoP2+", é: R$ %.2f%n",numeroP2*precoP2);
        System.out.printf("O total a ser pago é: R$ %.2f%n",valortotal);
        teclado.close();
    }
}
