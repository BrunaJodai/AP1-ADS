/* Fazer um programa que verifica se determinado número dado está dentro de um vetor também dado.
Caso esteja, imprimir a posição em que o número foi encontrado.*/
package Lista04Arrays;

import java.util.Scanner;

public class Ex18 {
    static Scanner console = new Scanner(System.in);

    static int lerN() {
        System.out.print("Tamanho do vetor: ");
        int n = Integer.parseInt(console.nextLine());

        return n;
    }
    
    static int num() {
        System.out.print("Numero p/ comparar: ");
        int num = Integer.parseInt(console.nextLine());

        return num;
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

    static void imprimeVetor(int[] vetor, int num) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
            System.out.printf("índice[%d] = [%d]\n" ,i ,vetor[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = lerN();
        int num = num();
        int[] vetor = criaPopulaVetor(n);
        imprimeVetor(vetor, num);
    }
    
}
