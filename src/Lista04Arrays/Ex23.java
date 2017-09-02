/* Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 21, se a linha for ímpar, e com 10 se a linha for par.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex23 {
    
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
                if (i%2!=0){
                    matriz [i][j] = 21;
                } else {
                    matriz [i][j] = 10;
                }
            }
        }
       return matriz;
    }
    
    static void imprimeMatriz (int [][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("\nlinha %d " ,i);
            for (int j = 0; j < matriz [i].length; j++) {
                System.out.printf("[%d]" ,matriz[i][j]);
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int n = tamanhoMatriz();
        int m = tamanhoMatriz();
        int [][]matriz = preencheMatriz(n, m);
        imprimeMatriz(matriz);
    }
}
