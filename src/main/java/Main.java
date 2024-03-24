import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número deve ser maior que 1.");
        } else {
            boolean ehPrimo = true;
            String divisores = "";

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    divisores += i + " ";
                }
            }

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
                System.out.println("É divisível por: " + divisores);
            }
        }

        scanner.close();
    }
}
