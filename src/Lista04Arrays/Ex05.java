/* Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex05 {

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

    static int somaVetores(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        return soma;
    }

    static double mediaVetores(int n, int soma) {
        double media = soma / n;

        return media;
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        int soma = somaVetores(vetor);
        double media = mediaVetores(n, soma);
        System.out.printf("Média: %d/%d = %.2f \n", soma, n, media);
    }

}
