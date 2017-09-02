/* Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente,
ou seja, o laço deve iniciar em 100 e encerrar em 1. Use o laço FOR. */
package Lista02Lacos;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        for (int i = 100; i >= 1; i = i - 2) {
            System.out.println(i);
        }
    }
}
