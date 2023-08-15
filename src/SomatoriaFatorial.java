/**
 * @author Renato Carvalho
 */
public class SomatoriaFatorial {

    /**
     * @param args São passados os argurmentos necessários para a matriz.
     */
    public static void main(String[] args) {
        int l = 4;
        int c = 4;
        int[][] arrayM = preencherMatriz(l, c);

        System.out.println("Matriz composto pelos fatoriais das somas dos índices: ");
        printarMatriz(arrayM);
    }

    /**
     * <p>Nesta função preechemos nossa matriz de acordo com o fatorial da soma dos índices.</p>
     * @param l Parâmetro l = recebe linhas.
     * @param c Parâmetro C = recebe colunas.
     * @return Retorna no final nossa matriz.
     */
    static int[][] preencherMatriz(int l, int c) {
        int[][] arrayM = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                int soma = i + j;
                int fatorial = calcularFatorial(soma);
                arrayM[i][j] = fatorial;
            }
        }
        return arrayM;
    }

    /**
     * <p>Nesta função passei como será o calculo do fatorial.</p>
     * @return No final retornamos nosso fatorial utilizado no método <b>preencherMatrizes</b>
     */
    static int calcularFatorial(int soma) {
        int fatorial = 1;
        for (int i = 1; i <= soma; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    /**
     * <p>Nesta função printamos nossa matriz utilizando um espaçamento em String vazia entre os resultados.</p>
     * @param arrayM Este parâmetro recebe o Array multidimensional.
     */
    static void printarMatriz(int[][] arrayM) {
        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[i].length; j++) {
                System.out.print(arrayM[i][j] + " ");
            }
            System.out.println();
        }
    }

}