/* Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE .*/
package Lista02Lacos;

import java.util.Scanner;

public class E07 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 1;

        while (i <= 200) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }

    }
}
