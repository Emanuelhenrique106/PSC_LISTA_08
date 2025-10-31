import java.util.Scanner;

public class Exercicio3 {

    /**
     * Função que retorna a soma de três argumentos.
     * 
     * a Primeiro argumento.
     * b Segundo argumento.
     * c Terceiro argumento.
     * A soma de a, b e c.
     */
    public static int somarTresArgumentos(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Programa para somar três números.");

        System.out.print("Informe o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        num3 = scanner.nextInt();

        int resultado = somarTresArgumentos(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);

        scanner.close();
    }
}