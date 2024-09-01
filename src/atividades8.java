import java.util.Scanner;

public class atividades8 {
    public static void main(String[] args) {

        double graus = 0;
        System.out.printf("quantos graus esta na sua cidade? ");
        Scanner entrada = new Scanner(System.in);
        graus = entrada.nextDouble();

        if (graus > 30) {
            System.out.printf("quente!");
        } else if (graus >= 16){
            System.out.printf("agradavel");
        }else if (graus <= 15) {
            System.out.printf("frio");
        }
    }
}