import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em segundos do evento");
        int segundosTotal = teclado.nextInt();
        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundos = (segundosTotal%3600)%60;

        System.out.println("O tempo de duração do evento é: "+horas+"h "+minutos+"m "+segundos+"s");
        teclado.close();
    }
}
