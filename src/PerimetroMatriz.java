import java.lang.Math;
/**
 * @author Renato Carvalho
 */
public class PerimetroMatriz {

    /**
     * <p>Neste bloco de código declarei linhas e colunas e atribui números aleatórios
     * de 1 à 100 aos índices.</p>
     */
    public static void main(String[] args) {
        int N = 3;
        int M = 5;
        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);
        System.out.println("**************|");

        System.out.println("\nMatriz sem os valores do perímetro:");
        imprimirMatrizPerimetro(matriz);
        System.out.println("**************|");
    }

    /**
     * <p>Nesta função criada só para impressão usei um for-each, mostrando a matriz completa.</p>
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    /**
     * <p>Nesta função imprime a matriz só com os números do perímetro, utilizei
     * for aninhado para percorrer linhas e colunas.<p/>
     */
    public static void imprimirMatrizPerimetro(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
