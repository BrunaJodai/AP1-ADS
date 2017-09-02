/* Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Lado do quadrado: ");
        double l = console.nextDouble();

        double a = l * l;

        System.out.println("A área do quadrado é = " + a);
    }
}
