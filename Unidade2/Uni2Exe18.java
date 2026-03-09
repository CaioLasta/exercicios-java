import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        float comprimento, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o comprimento da parede");
        comprimento = teclado.nextFloat();
        System.out.println("Insira a altura da parede");
        altura = teclado.nextFloat();
        final float preco = 12.5f*9f;
        System.out.println("O custo para cobrir a parede será de: R$"+preco*(comprimento*altura));
        teclado.close();
    }
}
