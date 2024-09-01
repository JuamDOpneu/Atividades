import java.util.Scanner;

public class atividade10 {

    //Quero Adicionar Um Desconto Gradativo
    //Valor Maior Que 1000 - 10%
    //Valor Maior Que 2000 - 20%
    //Valor Maior Que 3000 - 30%
    //Valor Menor Que 1000 - 0%
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("digite o valor da compra! ");
        double valorBruto =0;
        entrada.nextLine();
        double desconto = 0d;


        if (valorBruto > 100  && valorBruto < 200) {
            desconto = valorBruto * 0.5;
        }
        else if (valorBruto > 200 && valorBruto < 500) {
            desconto = valorBruto * (20 / 100);
        }
        System.out.println("valor bruto é " + valorBruto);
        System.out.println("Valor do desconto é " + desconto);
    }
}