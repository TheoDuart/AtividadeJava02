import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double custo, porc;

        System.out.print("Informe o custo de fábrica do carro: ");
        custo = tome.nextDouble();

        if (custo <= 12.000) {
            porc = custo * 0.05;
            System.out.println("O preço é do carro é: " + (custo + porc));
        }else if ((custo > 12000) && (custo < 25000)){
            porc = custo * 0.25;
            System.out.println("O preço do carro é: " + (custo + porc));
        } else if (custo > 25000){
            porc = custo * 0.35;
            System.out.println("O preço do carro é: " + (custo + porc));
        }
        tome.close();
    }
}
