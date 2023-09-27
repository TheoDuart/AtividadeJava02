import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double num1, num2, media, dif, produto, div;
        int escolha;

        System.out.println("Informe o primeiro número: ");
        num1 = tome.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = tome.nextDouble();
 
        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");
        escolha = tome.nextInt();

        switch (escolha) {
            case 1 : 
            media = (num1 + num2) /2;
            System.out.println("A média entre dos números é: " + media);
                
                break;
            case 2 : 
                dif = num1 - num2;
                System.out.println("A diferença do maior pelo menor é: " + dif);
                break;
            case 3 : 
            produto = num1 * num2;
            System.out.println("A multiplicação dos dois números é: " + produto);
            break;
            case 4 : 
            div = num1 / num2;
            System.out.println("A divisão desses dois números é: " + div);

            default:
            System.out.println("Essa opção é inválida");
                break;
        } 
        tome.close();
}
}
