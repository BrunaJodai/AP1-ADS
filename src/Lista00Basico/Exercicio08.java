/* Fazer um algoritmo que leia quatro números e imprime a média aritmética​ dos quatro números */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = console.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = console.nextDouble();
        System.out.print("Terceiro número: ");
        double n3 = console.nextDouble();
        System.out.print("Quarto número: ");
        double n4 = console.nextDouble();

        System.out.println("\nMédia: " + (n1 + n2 + n3 + n4)/4);
    }
}
