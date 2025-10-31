
import java.util.Scanner;

public class Main {

    /**
     * Imprime o padrão solicitado:
     * 1
     * 2 2
     * 3 3 3
     * ...
     * n n n n n n ... n
     * 
     * @param n O número de linhas a serem impressas.
     */
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + (j < i - 1 ? " " : ""));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro (n): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                imprimirPadrao(n);
            } else {
                System.out.println("O número deve ser positivo.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
        scanner.close();
    }
}