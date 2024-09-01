import java.util.Scanner;

public class atividades9 {
    public static void main(String[] args) {

        int num = 0;
        System.out.printf("Digite um numero: ");
        Scanner entrada = new Scanner(System.in);
        num= entrada.nextInt();

        if (num <= -1) {
            System.out.printf("negativo!");
        }else if (num >= 1) {
            System.out.printf("positivo!");
        }else if (num == 0) {
            System.out.printf("é zero");
        }
    }
}