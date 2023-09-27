import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double salario, novoSal, aum;

        System.out.print("Digite o salário do funcionário: ");
        salario = tome.nextDouble();

        if (salario <= 300){
            aum = salario * 0.5;
        }else if ((salario > 300) && (salario <= 500)){
            aum = salario * 0.4;
        }else if ((salario > 500) && (salario <= 700)){
            aum = salario * 0.3;
        }else if ((salario > 700) && (salario <= 800)){
            aum = salario * 0.2;
        }else if ((salario > 800) && (salario <= 1000)){
            aum = salario * 0.1;
        }else{
            aum = salario * 0.05;
        }

        novoSal = salario + aum;

        System.out.println("O novo salário é: " + novoSal);
        tome.close();
    }
}
