import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digita o valor do número 1: ");
        num1 = tome.nextInt();
        System.out.println("Digita o valor do número 2: ");
        num2 = tome.nextInt();
        System.out.println("Digita o valor do número 3: ");
        num3 = tome.nextInt();

        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O maior número é: " + num1);
        } else if ((num2 > num1) && (num2 > num3)){
           System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        } 
        tome.close();
    }
}
