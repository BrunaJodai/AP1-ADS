/* Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos N
números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve retornar -1.
Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 + 4. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex14 {

    static int num() {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor: ");
        int num = Integer.parseInt(console.nextLine());

        return num;
    }

    static int soma(int a, int n) {
        int soma = 0;
        int i = 1;
        int seq = a;
        if (n > 0) {
            while (i <= n) {
                //System.out.println("i = " + i);
                //System.out.printf("%d (soma) = %d (a) + %d (seq)\n" ,soma ,a ,seq);
                soma = a + seq;
                seq = seq + 1;
                i = i + 1;
            }
        } else {
            soma = -1;
        }

        return soma;
    }

    public static void main(String[] args) {
        int a = num();
        int n = num();
        int soma = soma(a, n);

        System.out.println("Soma: " + soma);
    }
}
