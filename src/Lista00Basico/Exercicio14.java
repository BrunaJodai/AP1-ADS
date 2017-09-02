/*Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.*/
package Lista00Basico;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double n1 = console.nextDouble();
        System.out.print("Digite outro valor: ");
        double n2 = console.nextDouble();

        if (n1 >= n2) {
            System.out.println(+n1+ "/" +n2+ " = " + n1/n2);
        } else {
            System.out.println(+n2+ "/" +n1+ " = " + n2/n1);
        }
    }
}
