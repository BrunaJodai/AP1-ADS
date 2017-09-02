/* Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
consecutivo de –9) */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Primeiro número inteiro: ");
        int num1 = console.nextInt();
        System.out.print("Segundo número inteiro: ");
        int num2 = console.nextInt();

        System.out.println("Os números consecutivos são: " + (++num1) + " e " + (++num2));

    }
}
