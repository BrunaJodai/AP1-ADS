/* Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e 
imprima o resultado. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex02 {
    
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
    
    static double somaVetor (double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor [i];
        }
        return soma;
    }
    
    public static void main(String[] args) {
        int n = lerN();
        double [] vetor = criaPopulaVetor(n);
        double soma = somaVetor(vetor);
        System.out.println("Soma dos elementos: " +soma);
    }
}
