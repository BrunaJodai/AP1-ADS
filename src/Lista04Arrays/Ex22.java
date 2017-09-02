/* Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 20.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex22 {
    static int tamanhoMatriz () {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Tamanho: ");
        int t = Integer.parseInt(console.nextLine());
        
        return t;
    }
    
    static int [][] preencheMatriz(int n, int m) {
        int [][] matriz = new int [n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz [i].length; j++) {
                matriz [i][j] = 20;
            }
        }
       return matriz;
    }
    
    static void imprimeMatriz (int [][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz [i].length; j++) {
                System.out.printf("[%d]" ,matriz[i][j]);
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int n = tamanhoMatriz();
        int m = tamanhoMatriz();
        int[][]matriz = preencheMatriz(n, m);
        imprimeMatriz(matriz);
    }
}
