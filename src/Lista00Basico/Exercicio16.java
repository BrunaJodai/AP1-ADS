/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que
o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima 
de 24 horas. */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        int duracao;

        System.out.print("Hora inicial do jogo: ");
        int inicio = console.nextInt();
        System.out.print("Hora final do jogo: ");
        int fim = console.nextInt();

        if (inicio >= 0 && fim <= 24 && inicio <= 24 && fim >= 0) {
            if (inicio < fim) {
                duracao = fim - inicio;
                System.out.println("Duração do jogo: " + duracao + "h");
            } else {
                duracao = (24 - inicio) + fim;
                System.out.println("Duração do jogo: " + duracao + "h");
            }
        } else {
            System.out.println("Dados inválidos");
        }
    }
}
