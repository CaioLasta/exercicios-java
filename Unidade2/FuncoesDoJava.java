import java.util.Random;

public class FuncoesDoJava {
    public static void main(String[] args) {
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        Random random = new Random();
        int numeroAle = random.nextInt(1000);
        System.out.println(numeroAle);
    }
}
