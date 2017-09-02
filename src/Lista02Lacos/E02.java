/* Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, 
e mostre o resultado obtido. Use o laço WHILE.*/
package Lista02Lacos;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int i = 1, soma = 0;
        
        System.out.print("Dê o valor de N: ");
        int n = Integer.parseInt(console.nextLine());
        
        while (i<=n) {
            soma = soma + i;
            i = i + 1;
        }
        
        System.out.printf("Soma dos números inteiros de 1 a %d: %d. \n" ,n ,soma);
    }
}