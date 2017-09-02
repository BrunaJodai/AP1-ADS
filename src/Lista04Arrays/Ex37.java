/* Dada uma matriz de tamanho N x M, de números inteiros, imprimir o número de linhas e o número de
colunas nulas da matriz. Por exemplo, para a matriz abaixo, deve imprimir: Duas linhas nulas e 
uma coluna nula. 
0 0 0
0 0 0
1 0 3
1 0 1   */
package Lista04Arrays;

import java.util.Scanner;

public class Ex37 {

    static Scanner console = new Scanner(System.in);

    static int tamanhoMatriz() {
        System.out.print("Tamanho: ");
        int t = Integer.parseInt(console.nextLine());

        return t;
    }

    static int[][] preencheMatriz(int n, int m) {
        System.out.println("\n~Preenche Matriz~");
        int[][] matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        int linhaNull = 0;
        int colunaNull = 0;
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
                if (matriz[i][j] == 0) {
                    linhaNull = linhaNull + 1;
                    colunaNull = colunaNull + 1;
                }
            }
            System.out.println();
        }
        System.out.println("Linhas nulas: " +linhaNull);
        System.out.println("Colunas nulas: " +colunaNull);
    }

    public static void main(String[] args) {
        System.out.println("LINHAS");
        int n = tamanhoMatriz();
        System.out.println("COLUNAS");
        int m = tamanhoMatriz();
        int[][] matriz = preencheMatriz(n, m);
        imprimeMatriz(matriz);
    }
}
