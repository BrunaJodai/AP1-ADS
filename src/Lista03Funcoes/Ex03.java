/* Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.
Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5 */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex03 {

    static int lerNum() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Digite um número positivo (N): ");
        num = Integer.parseInt(console.nextLine());

        return num;
    }

    static int fatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        int n = lerNum();
        int fatorial = fatorial(n);

        if (n > 0) {
            System.out.println("Fatorial de N: " + fatorial);
        } else {
            System.out.println("Número inválido.");
        }
    }
}
