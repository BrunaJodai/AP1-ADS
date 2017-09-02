/* Dada uma matriz de tamanho N x M e um vetor de M elementos, fazer um programa que preencha cada
linha da matriz com os elementos do vetor. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex29 {

    static Scanner console = new Scanner(System.in);

    static int tamanhoMatriz() {
        System.out.print("Tamanho: ");
        int t = Integer.parseInt(console.nextLine());

        return t;
    }

    static int[] preencheVetor(int m) {
        System.out.println("\n~Preenche Vetor~");
        int[] vetor = new int[m];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor [%d]: ", i);
            vetor[i] = Integer.parseInt(console.nextLine());
        }

        return vetor;
    }

    static int[][] preencheMatriz(int n, int m, int[] vetor) {
        //System.out.println("\n~Preenche Matriz~");
        int[][] matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = vetor[i];
            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("LINHAS");
        int n = tamanhoMatriz();
        System.out.println("COLUNAS E TAM. VETOR");
        int m = tamanhoMatriz();
        int[] vetor = preencheVetor(m);
        int[][] matriz = preencheMatriz(n, m, vetor);
        imprimeMatriz(matriz);
    }
}
