/* Dado um vetor de números reais e um número real, fazer um programa que multiplique os 
elementos de posição ímpar do vetor pelo número real dado e imprima o resultado.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex10 {

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

    static double x() {
        System.out.print("Número multiplicador: ");
        double x = Double.parseDouble(console.nextLine());

        return x;
    }

    static double[] result(double[] vetor, double x) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                vetor[i] = vetor[i] * x;
            }
        }
        return vetor;
    }

    static void imprimeVetor(double[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Vetor [%d]: %.2f \n", i, result[i]);
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        double[] vetor = criaPopulaVetor(n);
        double x = x();
        double[] result = result(vetor, x);
        imprimeVetor(result);
    }
}
