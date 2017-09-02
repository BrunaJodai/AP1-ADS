/*Fazer um algoritmo que leia três números e imprime o maior deles.*/
package Lista00Basico;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[]arg) {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Primeiro número: ");
        int n1 = console.nextInt();
        System.out.print("Segundo número: ");
        int n2 = console.nextInt();
        System.out.print("Terceiro número: ");
        int n3 = console.nextInt();
        
        if (n1>n2 && n1>n3) {
            System.out.println("\nMaior número: " +n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("\nMaior número: " +n2);
        } else if (n3>n1 && n3>n2) {
            System.out.println("\nMaior número: " +n3);
        } else {
            System.out.println("\nNúmeros iguais.");
        }
    }
}
