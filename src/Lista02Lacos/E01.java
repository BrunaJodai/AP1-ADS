/* Faça um programa que mostre todos os números inteiros de 1 a 50. Use o laço WHILE. */
package Lista02Lacos;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 1;

        while (i <= 50) {
            System.out.println(i);
            i = i + 1;
        }
    }

}