/* Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for */
package LacosRepeticao_Exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        System.out.print("Digite o valor de x: ");
        int x = Integer.parseInt(console.nextLine());
        
        System.out.printf("Números ímpares até %d:\n" ,x);
        for (int i = 1; i <= x; i = i + 2) {
            System.out.println(i);
        }
    }
}
