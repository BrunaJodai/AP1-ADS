/*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
quadrado de um número A é representado por A2 = A * A. */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        int n1, n2, n11, n22;

        System.out.print("Digite um número: ");
        n1 = console.nextInt();
        System.out.print("Digite o outro número: ");
        n2 = console.nextInt();

        n11 = n1 * n1;
        n22 = n2 * n2;

        System.out.println("Soma dos quadrados dos dois números: " + (n11 + n22));
    }
}
