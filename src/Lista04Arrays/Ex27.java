/* Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche os 
elementos da matriz com a soma do número da linha com o número da coluna em que se encontra. 
Imprimir a matriz.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex27 {
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
                matriz[i][j] = (i+j);
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
