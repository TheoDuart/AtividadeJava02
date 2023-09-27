import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double preco = 0.0, novoPreco = 0.0, des = 0.0;
        int codigo;

        System.out.print("Informe o valor do produto: ");
        preco = tome.nextDouble();

        System.out.print("Digite o código do produto: ");
        codigo = tome.nextInt();

        if (codigo == 1){
        }
        if (preco <= 30){
            System.out.println("Sem desconto!");
        }else if ((preco > 30) && (preco < 100)){
            des = preco * 0.10;
        }else if (preco > 100){
            des = preco * 0.15;
        }else {
            System.out.println("Código do produto inválido!");
            System.exit(1);
        }

        novoPreco = preco - des;

        System.out.println("O valor do desconto é: " + des);
        System.out.println("O novo preço é: " + novoPreco);
        tome.close();
    }
}
