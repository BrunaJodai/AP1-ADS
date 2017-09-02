/* Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se 
o número está presente no vetor. */
package Lista04Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }

    static int[] criaPopulaVetor(int n) {
        System.out.println("~PREENCHE COM RANDOM~");
        Random alea = new Random();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            int valor = alea.nextInt(n);
            vetor[i] = valor;
        }
        return vetor;
    }

    static int x() {
        System.out.print("Número comum: ");
        int x = Integer.parseInt(console.nextLine());

        return x;
    }

    static boolean verifica(int[] vetor, int x) {
        boolean comum = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                comum = true;
            }
        }
        return comum;
    }

    static void imprime(boolean comum) {
        if (comum) {
            System.out.println("O número está presente no vetor.");
        } else {
            System.out.println("O número NÃO está presente no vetor.");
        }
    }

    static void imprimeVetor(int[] vetor) {
        System.out.println("~VETOR~");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        int x = x();
        boolean comum = verifica(vetor, x);
        imprimeVetor(vetor);
        imprime(comum);
    }
}
