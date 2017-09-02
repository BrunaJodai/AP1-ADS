/* Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
elementos das colunas ímpares da matriz. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex32 {

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
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                //System.out.printf("[%d][%d] = [%d] \n", i, j, matriz[i][j]);
                if (j % 2 != 0) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.printf("Soma das colunas ímpares: %d \n", soma);
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
