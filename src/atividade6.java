import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {

        double nota = 0;
        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextDouble();

        if (nota <= 5) {
            System.out.printf("reprovado!");
        }else if (nota <= 7) {
            System.out.printf("recuperaco!");
        }else if (nota >= 7 && nota <= 10) {
            System.out.printf("aprovado!");
        }
    }
}
