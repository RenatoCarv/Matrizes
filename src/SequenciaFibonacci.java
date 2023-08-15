import java.util.Scanner;

/**
 * @author Renato Carvalho
 */
public class SequenciaFibonacci {
    /**
     * @param args Pede o número para executar sequência de Fibonacci.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    /**
     * @param n Recebe a variável n como parâmetro para o cálculo.
     * @return Dependendo do número digitado, pode retornar 0, 1 ou a sequência completa.
     */
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}