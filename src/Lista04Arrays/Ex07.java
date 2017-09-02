/* Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique 
todos os elementos do vetor pelo número real dado e imprima o resultado.*/
//multiplicar cada elemento do vetor ou todos os elementos???????
package Lista04Arrays;

import java.util.Scanner;

public class Ex07 {

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
        return vetor;
    }
    
    static int x() {
        System.out.print("Número multiplicador: ");
        int x = Integer.parseInt(console.nextLine());
        
        return x;
    }
    
    static int[] result(int[] vetor, int x) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * x;
        }
        return vetor;
    }
    
    static void imprimeVetor(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Vetor [%d]: %d \n", i, result[i]);
        }
    }
    
    public static void main(String[] args) {
        int n = lerN();
        int[] vetor = criaPopulaVetor(n);
        int x = x();
        int[] result = result(vetor, x);
        imprimeVetor(result);
    }
    
}
