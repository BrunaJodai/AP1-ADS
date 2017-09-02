/* Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor
C. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex09 {

    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho dos vetores: ");
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

    static int[] prodVetores(int[] vetorA, int[] vetorB, int n) {
        int[] prodVetores = new int[n];
        for (int i = 0; i < vetorA.length; i++) {
            prodVetores[i] = vetorA[i] * vetorB[i];
        }
        return prodVetores;
    }

    static void imprimeVetor(int[] vetorA, int[] vetorB, int[] prodVetores) {
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("A[%d] * B[%d] = [%d]\n", vetorA[i], vetorB[i], prodVetores[i]);
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetorA = criaPopulaVetor(n);
        int[] vetorB = criaPopulaVetor(n);
        int[] prodVetores = prodVetores(vetorA, vetorB, n);
        imprimeVetor(vetorA, vetorB, prodVetores);
    }
}
