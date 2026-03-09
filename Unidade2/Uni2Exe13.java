
import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a distância em Km entre os carros");
        int distancia = teclado.nextInt();
        System.out.println("O tempo que o carro X levará para se distanciar "+distancia+"Km do carro Y é: "+distancia*2+"min");
        teclado.close();
    }
}
