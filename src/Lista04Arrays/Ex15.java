/*Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex15 {

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
        System.out.println("");
        return vetor;
    }

    static void imprimeVetor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor [i] <= maior) {
                System.out.printf("vetor [%d]\n",vetor[i]);
            }
            
            System.out.printf("maior [%d]\n", maior);
        }
        //for (int i = 0; i < vetor.length; i++) {
            
      // }
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        imprimeVetor(vetor);
    }
}
