/* Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 7, se a coluna for ímpar, e com 4 se a coluna for par. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex24 {

    static Scanner console = new Scanner(System.in);

    static int tamanhoMatriz() {
        System.out.print("Tamanho: ");
        int t = Integer.parseInt(console.nextLine());

        return t;
    }

    static int[][] preencheMatriz(int n, int m) {
        int[][] matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 != 0) {
                    matriz[i][j] = 7;
                } else {
                    matriz[i][j] = 4;
                }
            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d][%d] = [%d] \n", i, j, matriz[i][j]);
            }
        }
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
