import java.util.Scanner;

public class Exercicio4 {

    /**
     * Função que retorna 'P' se o argumento for positivo, e 'N' se for zero ou negativo.
     * 
     *numero O argumento a ser verificado.
     *  'P' para positivo, 'N' para zero ou negativo.
     */
    public static char verificaPositivoNegativo(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            char resultado = verificaPositivoNegativo(num);
            System.out.println("O resultado da verificação é: " + resultado);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
        scanner.close();
    }
}