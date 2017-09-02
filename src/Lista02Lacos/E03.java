/* Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa
deve determinar e imprimir o maior deles. Use o laço FOR. */
package Lista02Lacos;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int comp = 0;
        
        for (int i = 1; i <=10; i = i+1) {
            System.out.printf("Valor do %d° número: " ,i);
            int n = Integer.parseInt(console.nextLine());
            
            if (n >= comp) {
                comp = n;
            }
        }
        System.out.println("O maior número é: " +comp);
    }
}