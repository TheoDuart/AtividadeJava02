import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int idade, grupoRisco; 
        double peso;

        System.out.print("Digite sua idade: ");
        idade = tome.nextInt();
        System.out.print("Digite seu peso: ");
        peso = tome.nextDouble();

        if (idade < 20){
            if (peso <= 60){
                grupoRisco = 9;
            }else if ((peso > 60) && (peso <= 90)){
                grupoRisco = 8;
            }else {
                grupoRisco = 7;
            } 
            System.out.println("Você se encaixa no grupo de risco: " + grupoRisco);
        }
        if ((idade >= 20) && (idade <= 50)){
            if (peso < 60){
                grupoRisco = 6;
            }else if ((peso > 60) && (peso <= 90)){
                grupoRisco = 5;
            }else {
                grupoRisco = 4;
            }
            System.out.println("Você se encaixa no grupo de risco: " + grupoRisco);
        }
        if (idade > 50){
            if (peso < 60){
                grupoRisco = 3;
            }else if ((peso > 60) && (peso <= 90)){
                grupoRisco = 2;
            }else {
                grupoRisco = 1;
            } 
            System.out.println("Você se encaixa no grupo de risco: " + grupoRisco);
        }
        
        tome.close();
    }       
}

