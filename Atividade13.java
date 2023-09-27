import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double preco, novo, aum; String clas;
        
       
        System.out.print("Digite o preço do produto: ");
        preco = tome.nextDouble();

        if (preco <=50){
            aum = preco * 0.05;
        }else if ((preco > 50) && (preco < 100)){
            aum = preco * 0.10;
        }else{
            aum = preco * 0.15;
        }
        
        novo = preco + aum;

        if (novo <= 80){
            clas = "Barato";
        }else if ((novo > 80) && (novo <= 120)){
            clas = "Normal";
        }else if ((novo > 120) && (novo <= 200)){
            clas = "Caro";
        }else {
            clas = "Muito caro";
        }

        System.out.println("O novo preço do produto é: " + novo);
        System.out.println("A classificação do produto é: " + clas);
        tome.close();
    }
}
