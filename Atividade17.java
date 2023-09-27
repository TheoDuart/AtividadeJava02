import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int senhaCorreta = 4531;
        int senhaIncorreta;

        System.out.print("Digite a senha: ");
        senhaIncorreta = tome.nextInt();

        if (senhaIncorreta == senhaCorreta){
            System.out.println("Acesso premitido!");
        }else {
            System.out.println("Acesso negado!");
        }
        tome.close();
    }
}
