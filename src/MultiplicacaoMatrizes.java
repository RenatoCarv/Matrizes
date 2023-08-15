import java.util.Arrays;

/**
 * @author Renato Carvalho
 */
public class MultiplicacaoMatrizes {
    /**
     * <p>Neste bloco de código declarei linhas e colunas e atribui números para as duas matrizes.</p>
     * @param args São passados os argumentos necessários para as matrizes.
     */
    public static void main(String[] args) {
        int[][] matrizA = {
                {1,2,3},
                {4,5,6},
        };

        int[][] matrizB = {
                {1,2},
                {3,4},
                {5,6}
        };

        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

        if (resultado == null) {
            System.out.println("Não é possivel mostrar a matriz multiplicada");
        } else {
            System.out.println("Resultado das multiplicações das matrizes:");
            imprimirMatriz(resultado);
        }
    }

    /**
     * <p>Nesta função multiplicamos os índices das linha pela coluna e somamos os valores.</p>
     * @param matrizA O parâmetro recebe a matriz A.
     * @param matrizB O Parâmetro recebe a matriz B.
     * @return Retorno null se a quantidade de colunas A for diferente da coluna B.
     */
    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        if (colunasA != linhasB) {
            return null;
        }

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                int soma = 0;
                for (int k = 0; k < colunasA; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = soma;
            }
        }
        return resultado;
    }
    /**
     * <p>Nesta função imprime a matriz convertendo para String evitando exibições distorcidas.<p/>
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha: matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
