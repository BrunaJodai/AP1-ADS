/* Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex01 {

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

    static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor %d = [%d]\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        int [] vetor = criaPopulaVetor(n);
        imprimeVetor(vetor);
    }

}
