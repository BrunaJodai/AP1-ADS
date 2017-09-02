/* Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. 
Utilize o laço que lhe for mais conveniente. */
package Lista02Lacos;

import java.util.Scanner;

public class E08 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int soma = 0, d = 0;

        for (int i = 13; i <= 73; i++) {
            if (i % 2 == 0) {
                soma = soma + i;
                d = d + 1;
                //System.out.println("i: " + i);
                //System.out.println("soma: " + soma);
                //System.out.println("d: " + d);
            }
        }
        System.out.println("Média: " +(soma / d));
    }
}
