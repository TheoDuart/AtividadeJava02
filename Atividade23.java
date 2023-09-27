import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do produto comprado(1 a 40): ");
        int codigo = scanner.nextInt();

        System.out.print("Informe a quantidade do produto comprado: ");
        int quantidade = scanner.nextInt();

        double precoUnitario, precoTotal, precoFinal;

        if(codigo >= 1 && codigo <=10){
            precoUnitario = 10;
        }else if(codigo >=11 && codigo <=20){
            precoUnitario = 15;
        }else if(codigo >=21 && codigo <=30){
            precoUnitario = 20;
        }else if(codigo >= 31 && codigo <=40){
            precoUnitario = 30;
        }else{
            precoUnitario = 0;
            System.out.println("codigo inválido!");
        }

        precoTotal = precoUnitario * quantidade;

        double desconto;

        if(precoTotal <= 250){
            desconto = precoTotal * 0.05;
        }else if(precoTotal >250 && precoTotal <=500){
            desconto = precoTotal * 0.1;
        }else{
            desconto = precoTotal * 0.15;
        }

        precoFinal = precoTotal - desconto;

        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Preço Total da Nota: R$ " + precoTotal);
        System.out.println("Valor do Desconto: R$ " + desconto);
        System.out.println("Preço Final da Nota: R$ " + precoFinal);

        scanner.close();
    }
}
