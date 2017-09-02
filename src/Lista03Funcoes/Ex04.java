/* Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n 
primeiros números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3.*/
package Lista03Funcoes;

import java.util.Scanner;

public class Ex04 {

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

    static int somatoria(int n) {
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        return soma;
    }

    static double divisao(int fatorial, int soma) {
        //System.out.println("Fatorial: " +fatorial);
        //System.out.println("Soma: " +soma);
        double divisao = fatorial / soma;
        return divisao;
    }

    public static void main(String[] args) {
        int n = lerNum();
        int fatorial = fatorial(n);
        int soma = somatoria(n);
        double divisao = divisao(fatorial, soma);

        System.out.printf("Resultado de %d/%d = %.2f \n", fatorial, soma, divisao);
    }
}
