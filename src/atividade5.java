import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int diasSemana = 0;
        System.out.printf("digite um um numero de 1 a 7 conrespondete a cada dia da semana: ");
        Scanner dia = new Scanner(System.in);
        diasSemana = dia.nextInt();
        switch (diasSemana) {
            case 1:
                System.out.printf("segunda");
                break;
            case 2:
                System.out.printf("terca");
                break;
            case 3:
                System.out.printf("quarta");
                break;
            case 4:
                System.out.printf("quinta");
                break;
            case 5:
                System.out.printf("sexta");
                break;
            case 6:
                System.out.printf("sabado");
                break;
            case 7:
                System.out.printf("domingo");
                break;
                default:
                    System.out.println("Erro!");

        }
    }
}
