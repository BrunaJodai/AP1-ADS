/*Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos. */
package LacosRepeticao_Exercicios;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int soma = 0, vezes = 1, qntd = 0;

        while (vezes <= 6) {
            System.out.printf("Digite o %dº valor: " ,vezes);
            int valor = Integer.parseInt(console.nextLine());
            vezes = vezes + 1;
            if (valor >= 0) {
                soma = soma + valor;
                qntd = qntd + 1;
            }
        }
        System.out.println("Soma dos valores positivos: " + soma);
        System.out.println("Quantidade de valores positivos: " +qntd);
        System.out.println("Média: " + (soma / qntd));
    }
}