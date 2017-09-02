/* Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex03 {

    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }

    static int[] criaPopulaVetor(int n) {
        int[] vetor = new int[n];
        boolean valido = false;
        for (int i = 0; i < n; i++) {
            do {
                try {
                    System.out.printf("Elemento do vetor[%d]: ", i);
                    vetor[i] = Integer.parseInt(console.nextLine());
                    valido = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Digite um elemento de valor inteiro.");
                    i = i - 1;
                }

            } while (!valido);
        }
        return vetor;
    }

    static int maiorElem(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        int maior = maiorElem(vetor);
        System.out.println("Maior elemento do vetor: " + maior);
    }
}
