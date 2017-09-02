/*Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, 
imprimir na tela a mensagem "Numero negativo" */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = console.nextInt();

        if (num < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número positivo.");
        }
    }
}
