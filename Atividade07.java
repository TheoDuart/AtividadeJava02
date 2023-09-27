import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double aum, salario, salarioRe;

        System.out.println("Informe o valor do salário do funcionário: ");
        salario = tome.nextDouble();

        if (salario >= 500){
            System.out.println("Ele não tem direito ao aumento");
        } else if (salario < 500){
            aum = salario * 0.30;
            salarioRe = salario + aum;
            System.out.println("Esse é o valor do salário reajustado: $" + salarioRe);
        }
        tome.close();
    }
}
