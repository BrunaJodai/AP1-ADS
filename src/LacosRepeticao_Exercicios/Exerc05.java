/* Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.
A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
1 x N = N 2 x N = 2N ... 10 x N = 10N*/
package LacosRepeticao_Exercicios;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = 1;

        System.out.print("Digite um valor inteiro: ");
        int n = Integer.parseInt(console.nextLine());
        
        System.out.printf("TABUADA DE %d:\n" ,n);
        if (n >= 2 && n <= 1000) {
            do {
                System.out.println(x + " x " +n+ " = " +(x*n));
                x = x+1;
            } while (x <= 10);

        }
    }
}
