import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float notaA, notaB, mediaPonderada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a nota A");
        notaA = teclado.nextFloat();
        System.out.println("Insira a nota B");
        notaB = teclado.nextFloat();
        mediaPonderada = ((notaA*3.5f)+(notaB*7.5f))/11f;
        System.out.println("A média é: "+mediaPonderada);
        teclado.close();
    }
}
