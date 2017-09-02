/* Dado um vetor de números reais e um número real, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex17 {

    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }

    static double num() {
        System.out.print("Numero p/ multiplicar: ");
        double num = Double.parseDouble(console.nextLine());

        return num;
    }

    static double[] criaPopulaVetor(int n) {
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento do vetor[%d]: ", i);
            vetor[i] = Double.parseDouble(console.nextLine());
        }
        System.out.println("");
        return vetor;
    }

    static void imprimeVetor(double[] vetor, double num) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%.2f] * %.2f = %.2f\n", vetor[i], num, (vetor[i] * num));
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        double num = num();
        double[] vetor = criaPopulaVetor(n);
        imprimeVetor(vetor, num);
    }
}
