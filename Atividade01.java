import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Informe a nota 1: ");
        nota1 = tome.nextDouble();
        System.out.print("Informe a nota 2: ");
        nota2 = tome.nextDouble();
        System.out.print("Informe a nota 3: ");
        nota3 = tome.nextDouble();
        System.out.print("Informe a nota 4: ");
        nota4 = tome.nextDouble();

        media =(nota1 + nota2 + nota3 + nota4) /4;

        
        if (media >=7){
            System.out.println("Aprovado: " + media);
        } else{
            System.out.println("Reprovado: " + media);
        } 
        tome.close();
    }
}
