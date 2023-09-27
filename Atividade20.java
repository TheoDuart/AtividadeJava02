import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        int idade;
        
        System.out.print("Informe sua idade: ");
        idade = tome.nextInt();

        if (idade < 5){
            System.out.println("Não categorizado.");
        }else if ((idade >= 5) && (idade <= 7)){
            System.out.println("Sua categoria é : Infantil");
        }else if ((idade >= 8) && (idade <= 10)){
            System.out.println("Sua categoria é : Juvenil");
        }else if ((idade >= 11) && (idade <= 15)){
            System.out.println("Sua categoria é : Adolescente");
        }else if ((idade >= 16) && (idade <= 30)){
            System.out.println("Sua categoria é : Adulto");
        }else {
            System.out.println("Sua categoria é : Sênior");
        }
        tome.close();
    }
}
