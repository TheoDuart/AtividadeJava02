import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe o valor do primeiro número: ");
        num1 = tome.nextInt();
        System.out.println("Informe o valor do segundo número: ");
        num2 = tome.nextInt();

        if (num1 < num2){
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1){
            System.out.println("O menor número é: " + num2);
        }
        tome.close();
    }
}
