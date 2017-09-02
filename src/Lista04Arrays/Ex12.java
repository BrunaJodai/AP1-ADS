/* Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a 
média de cada vetor, e imprime a maior soma e a menor média.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex12 {

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
        System.out.println("");
        return vetor;
    }

    static double somaVetor(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        return soma;
    }

    static double mediaVetor(double soma, int n) {
        double media = soma / n;

        return media;
    }

    static void imprimeMaiorSoma(double somaA, double somaB) {
        if (somaA > somaB) {
            System.out.println("A maior SOMA é do vetor A: " + somaA);
        } else if (somaB > somaA) {
            System.out.println("A maior SOMA é do vetor B: " + somaB);
        } else {
            System.out.println("A SOMA dos dois vetores são iguais: " + somaA);
        }
    }

    static void imprimeMaiorMedia(double mediaA, double mediaB) {
        if (mediaA > mediaB) {
            System.out.println("A maior MÉDIA é do vetor A: " + mediaA);
        } else if (mediaB > mediaA) {
            System.out.println("A maior MÉDIA é do vetor B: " + mediaB);
        } else {
            System.out.println("A MÉDIA dos dois vetores são iguais: " + mediaA);
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        double[] vetorA = criaPopulaVetor(n);
        double[] vetorB = criaPopulaVetor(n);

        double somaA = somaVetor(vetorA);
        double somaB = somaVetor(vetorB);

        double mediaA = mediaVetor(somaA, n);
        double mediaB = mediaVetor(somaB, n);

        imprimeMaiorSoma(somaA, somaB);
        imprimeMaiorMedia(mediaA, mediaB);
    }
}
