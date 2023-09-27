import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double salario, aum1, aum2, salarioRe;

        System.out.println("Informe o salário do funcionário: ");
        salario = tome.nextDouble();

        if (salario <= 300){
            aum1 = salario * 0.35;
            salarioRe = aum1 + salario;
            System.out.println("O salário com aumento é: " + salarioRe);
        } else if (salario > 300){
            aum2 = salario * 0.15;
            salarioRe = salario + aum2;
            System.out.println("O salário com aumento é: " + salarioRe);
        }
        tome.close();
    }
}
