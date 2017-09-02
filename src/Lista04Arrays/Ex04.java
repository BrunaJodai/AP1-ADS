/* Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex04 {

    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }

    static double[] criaPopulaVetor(int n) {
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento do vetor[%d]: ", i);
            vetor[i] = Double.parseDouble(console.nextLine());
        }

        return vetor;
    }

    static double maiorElem(double[] vetor) {
        double maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int n = lerN();
        double[] vetor = criaPopulaVetor(n);
        double maior = maiorElem(vetor);
        System.out.println("Maior elemento do vetor: " + maior);
    }
}
