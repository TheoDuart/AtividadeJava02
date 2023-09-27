import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário bruto do funcionário: ");
        double salario = scanner.nextDouble();

        double gratificacao;
        double imposto = salario * 0.07;

        if (salario <= 350.0) {
            gratificacao = 100.0;
        } else if (salario > 350.0 && salario <= 600.0) {
            gratificacao = 75.0;
        } else if (salario > 600.0 && salario <= 900.0) {
            gratificacao = 50.0;
        } else {
            gratificacao = 35.0;
        }

        double valorAReceber = salario + gratificacao - imposto;

        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Gratificação: R$ " + gratificacao);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor a Receber: R$ " + valorAReceber);

        scanner.close();
    }
}

