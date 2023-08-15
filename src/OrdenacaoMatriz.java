import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Renato Carvalho
 */
public class OrdenacaoMatriz {
    /**
     * @param args Determina o tamanho da matriz (linha e colunas).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        preencherMatrizAleatoriamente(matriz);
        imprimirMatriz(matriz, "Matriz Inicial:");

        System.out.print("Escolha o tipo de ordenação (crescente ou decrescente): ");
        String tipoOrdenacao = scanner.next();

        if (tipoOrdenacao.equalsIgnoreCase("crescente") || tipoOrdenacao.equalsIgnoreCase("decrescente")) {
            ordenarMatriz(matriz, tipoOrdenacao);
            imprimirMatriz(matriz, "Matriz Ordenada " + tipoOrdenacao);
        } else {
            System.out.println("Tipo de ordenação inválida");
        }
    }

    /**
     * <p>Preenche a matriz com números inteiros aleatórios entre 0 e 40.</p>
     *
     * @param matriz A matriz é preenchida com números inteiros aleatórios.
     */
    public static void preencherMatrizAleatoriamente(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(40);
            }
        }
    }
    /**
     * <p>Ordena a matriz de acordo com o tipo escolhido (crescente ou decrescente).</p>
     *
     * @param matriz matriz a ser ordenada.
     * @param tipoOrdenacao Tipo de ordenação, "Crescente" ou "Decrescente".
     */
    public static void ordenarMatriz(int[][] matriz, String tipoOrdenacao) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[] MatrizTemp = new int[linhas * colunas];
        int indice = 0;

        for (int[] ints : matriz) {
            for (int j = 0; j < colunas; j++) {
                MatrizTemp[indice++] = ints[j];
            }
        }

        Arrays.sort(MatrizTemp);

        if (tipoOrdenacao.equalsIgnoreCase("decrescente")) {
            for (int i = 0; i < MatrizTemp.length / 2; i++) {
                int temp = MatrizTemp[i];
                MatrizTemp[i] = MatrizTemp[MatrizTemp.length - 1 - i];
                MatrizTemp[MatrizTemp.length - 1 - i] = temp;
            }
        }

        indice = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = MatrizTemp[indice++];
            }
        }
    }
/**
 * <p>Imprime o conteúdo da matriz no console.</p>
 *
 * @param matriz  A matriz é impressa.
 * @param titulo  Mostra o título para a matriz impressa.
 **/
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}