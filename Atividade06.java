import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double num1, num2, exp, raiz1, raiz2, raiz3, raiz4;
        int escolha;

        System.out.println("Informe o valor do primeiro número: ");
        num1 = tome.nextDouble();
        System.out.println("Informe o valor do primeiro número: ");
        num2 = tome.nextDouble();
        

        System.out.println("Escolha operação:");
        System.out.println("1 - Elevação do primeiro pelo segundo: ");
        System.out.println("2 - Raiz quadrada dos números: ");
        System.out.println("3 - Raiz cúbica dos números: ");
        escolha = tome.nextInt();

            switch (escolha) {
            case 1:
                exp = Math.pow(num1,num2);
                System.out.println("A exponenciação é: " + exp);
                break;
            case 2 : 
                raiz1 = Math.sqrt(num1);
                raiz2 = Math.sqrt(num2);
                System.out.println("A raiz do 1° é: " + raiz1);
                System.out.println("A raiz do 2° é: " + raiz2);
            case 3 : 
                raiz3 = Math.cbrt(num1);
                raiz4 = Math.cbrt(num2);
                System.out.println("A raiz cúbica do 1° é: " + raiz3);
                System.out.println("A raiz cúbica do 2° é: " + raiz4);
                
            default:
            System.out.println("Essa opção é inválida!");
                break;



        
        } 
        tome.close();
    }
}
