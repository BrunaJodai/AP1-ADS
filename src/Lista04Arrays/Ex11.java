/* Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
dos elementos que estão nas posições pares do vetor. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex11 {

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

    // soma os elementos dos vetores par, p/ utilizar no cálculo da média
    static double somaVetoresP(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                soma = soma + vetor[i];
            }
        }

        return soma;
    }

    //contador de qntas posições pares tem no vetor
    static int contP(double[] vetor) {
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                cont = cont + 1;
            }
        }
        return cont;
    }

    static double mediaVetores(int cont, double somaP) {
        double media = somaP / cont;

        return media;
    }

    static void imprime(double[] vetor, double media) {
        System.out.println("MÉDIA DAS POSIÇÕES PARES: " + media);
        System.out.println("NÚMEROS MAIORES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.printf("Vetor [%d]: %.2f \n", i, vetor[i]);
            }
        }
    }

    public static void main(String[] args) {
        int n = lerN();
        double[] vetor = criaPopulaVetor(n);
        double somaP = somaVetoresP(vetor);
        int cont = contP(vetor);
        double media = mediaVetores(cont, somaP);
        imprime(vetor, media);
    }
}
