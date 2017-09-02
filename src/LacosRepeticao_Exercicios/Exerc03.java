/*Crie um laço que imprima uma contagem regressiva de 100 a 0, mas que decremente
de 5 em 5. Use o laço for */
package LacosRepeticao_Exercicios;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
       
        for (int n = 100; n >= 0; n = n - 5) {
            System.out.println(n);
        }
    }
}