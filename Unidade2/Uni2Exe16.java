import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        int lata, garrafa600, garrafa2l;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira quantas latas de 350mL foram compradas");
        lata = teclado.nextInt();
        System.out.println("Insira quantas garrafas de 600mL foram compradas");
        garrafa600 = teclado.nextInt();
        System.out.println("Insira quantas garrafas de 2L foram compradas");
        garrafa2l = teclado.nextInt();
        float total = lata*0.35f+garrafa600*0.6f+garrafa2l*2f;
        System.out.println("O total de litros comprados foi de: "+total);
        teclado.close();
    }
}
