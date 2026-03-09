import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        // float prova1 = 7;
        // float prova2 = 9;
        // float trabalhoFinal = 9.7f;
        // float mediaTrabalhos = (10 + 8.5f + 0 + 5 + 10 + 9.8f + 9.5f) / 7;

        // float media = prova1 * 0.2f + prova2 * 0.5f + trabalhoFinal * 0.3f +
        // mediaTrabalhos * 0.2f;
        // System.out.println("Média final = " + media);

        float prova1 = 0;
        float prova2 = 0;
        float trabalhoFinal = 0;
        float mediaTrabalhos = 0;
        float trabalhoUnidade1 = 0;
        float trabalhoUnidade2 = 0;
        float trabalhoUnidade3 = 0;
        float trabalhoUnidade4 = 0;
        float trabalhoUnidade5 = 0;
        float trabalhoUnidade6 = 0;
        float trabalhoUnidade7 = 0;
        float mediaFinalPonderada = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1");
        prova1 = teclado.nextFloat();
        System.out.println("Digite a nota da prova 2");
        prova2 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho final");
        trabalhoFinal = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 1");
        trabalhoUnidade1 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 2");
        trabalhoUnidade2 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalgo da unidade 3");
        trabalhoUnidade3 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 4");
        trabalhoUnidade4 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 5");
        trabalhoUnidade5 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 6");
        trabalhoUnidade6 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho da unidade 7");
        trabalhoUnidade7 = teclado.nextFloat();

        mediaTrabalhos = (trabalhoUnidade1 + trabalhoUnidade2 + trabalhoUnidade3 + trabalhoUnidade4 + trabalhoUnidade5
                + trabalhoUnidade6 + trabalhoUnidade7) / 7;

        mediaFinalPonderada = (prova1 * 0.2f + prova2 * 0.3f + trabalhoFinal * 0.3f + mediaTrabalhos * 0.2f);
        System.out.println("Média final = " + mediaFinalPonderada);
        
        System.out.printf("Média final = %.2f%n", mediaFinalPonderada);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Media fina = " + df.format(mediaFinalPonderada));

        if (mediaFinalPonderada >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        teclado.close();
    }
}
