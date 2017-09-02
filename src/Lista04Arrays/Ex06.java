/* Dado um vetor de números inteiros, fazer um programa que imprima o produto dos elementos 
do vetor. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex06 {
    
    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }

    static int[] criaPopulaVetor(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento do vetor[%d]: ", i);
            vetor[i] = Integer.parseInt(console.nextLine());
        }
        return vetor;
    }

    static int prodVetores(int[] vetor) {
        int prod = 1;
        for (int i = 0; i < vetor.length; i++) {
            prod = prod * vetor[i];
        }

        return prod;
    }

        public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        int produto = prodVetores(vetor);
        
        System.out.println("Produto: " +produto);
    }
            
}
