/* Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B. */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite um valor para A: ");
        a = console.nextDouble();
        System.out.print("Digite um valor para B: ");
        b = console.nextDouble();
        System.out.print("Digite um valor para C: ");
        c = console.nextDouble();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Área do triângulo retângulo que tem A por base e C por altura: " + (a * c) / 2);
        System.out.println("Área do círculo de raio C: " + (3.14 * (c * c)));
        System.out.println("Área do trapézio que tem A e B por bases e C por altura: " + (c * (a + b)) / 2);
        System.out.println("Área do quadrado que tem lado B: " + b * b);
        System.out.println("Área do retângulo que tem lados A e B: " + a * b);
        System.out.println("Perímetro do retângulo que tem lados A e B: " + 2 * (a + b));
    }
}
