import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double valor, valorCorrigido, ren;
        
        int escolha;

        System.out.print("Digite o valor do investimento: ");
        valor = tome.nextDouble();
        

        System.out.println("1 - Poupança");
        System.out.println("2 - Fundos de renda fixa");
        escolha = tome.nextInt();

        switch (escolha) {
            case 1:
                ren = valor * 0.03;
                valorCorrigido = ren + valor;
                System.out.println("O valor corrigido é: " + valorCorrigido);
                break;
            case 2: 
                ren = valor * 0.04;
                valorCorrigido = ren + valor;
                System.out.println("O valor corrigido é: " + valorCorrigido);
            default:
                break;
        }
        tome.close();
    }
}
