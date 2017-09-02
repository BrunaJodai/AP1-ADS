/* Fazer um programa que imprime os elementos que estão nas posições ímpares de um vetor 
(começando na posição 1, que corresponde à posição 0 em Java). 
Por exemplo, para o vetor [6, 8, 2, 3, 7, 1, 5, 3, 9], seriam impressos os números: 6, 2, 7, 5, 9. */
package Lista04Arrays;

import java.util.Scanner;

public class Ex19 {
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
        System.out.println("");
        return vetor;
    }
    
    static void imprimeVetor(int[] vetor) {
        System.out.println("Elementos nas posições ímpares");
        for (int i = 0; i < vetor.length; i++) {
            if (i%2==0) {
            System.out.printf("índice[%d] = [%d]\n" ,i ,vetor[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        imprimeVetor(vetor);
    }
    
}
