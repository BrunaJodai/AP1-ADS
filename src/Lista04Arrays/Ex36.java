/* Dada uma matriz de tamanho N x N, de números inteiros, fazer um programa que imprime os elementos
da diagonal principal. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex36 {

    static Scanner console = new Scanner(System.in);

    static int tamanhoMatriz() {
        System.out.print("Tamanho: ");
        int t = Integer.parseInt(console.nextLine());

        return t;
    }

    static int[][] preencheMatriz(int n) {
        System.out.println("\n~Preenche Matriz~");
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz, int n) {
        //mostra a matriz antes
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("");
        //mostra a diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print("[" + matriz[i][j] + "] ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("LINHAS E COLUNAS");
        int n = tamanhoMatriz();
        int[][] matriz = preencheMatriz(n);
        imprimeMatriz(matriz, n);
    }
}
