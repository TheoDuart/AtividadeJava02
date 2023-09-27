import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = tome.nextInt();

        if (idade < 18){
            System.out.println("Menor idade.");
        }else{
            System.out.println("Maior idade.");
        }
        tome.close();
    }
}
