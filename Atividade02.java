import java.util.Scanner;                       

public class Atividade02 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite a nota 1: ");
        nota1 = tome.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = tome.nextDouble();

        media = (nota1 + nota2) /2;

        if ((media >=0) && (media <3)){
            System.out.println("Reprovado: " + media);
        } else if ((media >=3) && (media <7)){
            System.out.println("Exame: " + media);
        } else if ((media >=7) && (media <=10)){
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Média Inválida!");
        }
        tome.close();
    }
}
