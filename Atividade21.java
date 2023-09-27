import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.println("Digite o código de origem do produto: ");
        int codigoOrigem = scanner.nextInt();

        String procedencia;

        if (codigoOrigem == 1) {
            procedencia = "Sul";
        } else if (codigoOrigem == 2) {
            procedencia = "Norte";
        } else if (codigoOrigem == 3) {
            procedencia = "Leste";
        } else if (codigoOrigem == 4) {
            procedencia = "Oeste";
        } else if (codigoOrigem == 5 || codigoOrigem == 6) {
            procedencia = "Nordeste";
        } else if (codigoOrigem == 7 || codigoOrigem == 8 || codigoOrigem == 9) {
            procedencia = "Sudeste";
        } else if (codigoOrigem >= 10 && codigoOrigem <= 20) {
            procedencia = "Centro-oeste";
        } else if (codigoOrigem >= 21 && codigoOrigem <= 30) {
            procedencia = "Nordeste";
        } else {
            procedencia = "Procedência não identificada";
        }

        System.out.println("Procedência do Produto: " + procedencia);

        scanner.close();
    }
}
