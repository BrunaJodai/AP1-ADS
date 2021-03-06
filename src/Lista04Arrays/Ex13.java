/* Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual 
deve ser composto pelos elementos do vetor A e depois pelos elementos do vetor B. 
Imprimir o vetor C. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex13 {

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

    static int[] vetorC(int[] vetorA, int[] vetorB) {
        int t = vetorA.length * 2;
        int[] vetorC = new int[t];
        for (int i = 0; i < vetorC.length; i++) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i - vetorA.length];
            }
        }
        return vetorC;
    }

    static void imprimeVetor(int[] vetorA, int[] vetorB, int[] vetorC) {
        System.out.println("VETOR A E B:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("A[%d] ", vetorA[i]);
            System.out.printf("B[%d] \n", vetorB[i]);
        }
        System.out.println("\nVETOR C");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("C[%d] ", vetorC[i]);
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetorA = criaPopulaVetor(n);
        int[] vetorB = criaPopulaVetor(n);
        int[] vetorC = vetorC(vetorA, vetorB);
        imprimeVetor(vetorA, vetorB, vetorC);
    }
}
