import java.util.Scanner;

public class ativiade4 {
    public static void main(String[] args) {

        String user = "rocasito";
        int Senha = 136345;

        Scanner sc = new Scanner(System.in);
         System.out.printf("digite seu usuario");
         String usuario = sc.nextLine();
         System.out.println("Digite sua senha: ");
         int senha = sc.nextInt();
        if (user.equals(usuario) && Senha == senha) {
            System.out.printf("senha correta com sucesso");
        }else {
            System.out.printf("senha incorreta");
        }


    }


}
