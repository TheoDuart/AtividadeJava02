import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner tome = new Scanner(System.in);
        double saldoMedio, valorCredito, cred;

        System.out.println("Informe o valor do saldo médio anual: ");
        saldoMedio = tome.nextDouble();

        if (saldoMedio > 400){
            cred = saldoMedio * 0.30;
            valorCredito = cred;
            System.out.println("O valor do saldo médio é: $" + saldoMedio);
            System.out.println("O valor do crédito é: $" + valorCredito);
        } else if ((saldoMedio > 300) && (saldoMedio <= 400)){
            cred = saldoMedio * 0.25;
            valorCredito =   cred;
            System.out.println("O valor do saldo médio é: $" + saldoMedio);
            System.out.println("O valor do crédito é: $" + valorCredito);
        } else if ((saldoMedio > 200) && (saldoMedio <=300)){
            cred = saldoMedio * 0.20;
            valorCredito = cred;
            System.out.println("O valor do saldo médio é: $" + saldoMedio);
            System.out.println("O valor do crédito é: $" + valorCredito);
        } else if (saldoMedio <= 200){
            cred = saldoMedio * 0.10;
            valorCredito = cred;
            System.out.println("O valor do saldo médio é: $" + saldoMedio);
            System.out.println("O valor do crédito é: $" + valorCredito);
        }
        tome.close();
    }
}
