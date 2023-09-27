import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double salario, aum, novoSal;

        System.out.print("Informe o valor do salário atual: ");
        salario = tome.nextDouble();

        if (salario <= 300){
            aum = salario * 0.15;
            novoSal = salario + aum;
            System.out.println("O valor do aumento é: $" + aum);
            System.out.println("O novo salário é: $" + novoSal);
        }else if ((salario > 300) && (salario < 600)){
            aum = salario * 0.10;
            novoSal = salario + aum;
            System.out.println("O valor do aumento é: $" + aum);
            System.out.println("O novo salário é: $" + novoSal);
        }else if ((salario >= 600) && (salario <= 900)){
             aum = salario * 0.05;
            novoSal = salario + aum;
            System.out.println("O valor do aumento é: $" + aum);
            System.out.println("O novo salário é: $" + novoSal);
        } else {
            System.out.println("Não recebe aumento!");
        }
        tome.close();
    }
}
