/* Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.*/
package Lista03Funcoes;

import java.util.Scanner;

public class Ex02 {

    static int lerNum() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Digite um número positivo (N): ");
        num = Integer.parseInt(console.nextLine());

        return num;
    }

    static int somatoria(int n) {
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        return soma;
    }

    public static void main(String[] args) {
        int n = lerNum();
        int soma = somatoria(n);

        if (n > 0) {
            System.out.println("Soma dos números menores ou iguais a N: " + soma);
        } else {
            System.out.println("Número inválido.");
        }
    }
}
