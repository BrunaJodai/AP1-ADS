/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a 
variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos". */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = console.nextInt();
        System.out.print("Valor de B: ");
        int b = console.nextInt();
        System.out.print("Valor de C: ");
        int c = console.nextInt();
        System.out.print("Valor de D: ");
        int d = console.nextInt();

        int cd = c + d;
        int ab = a + b;

        if (b>c && d>a && cd>ab && c>0 && d>0 && a%2==0) {
            System.out.println("Valores aceitos.");
        } else {
            System.out.println("Valores não aceitos.");
        }

    }
}