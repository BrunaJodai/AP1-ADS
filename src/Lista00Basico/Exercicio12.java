/* Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um
quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo". */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[]arg) {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Digite o valor do lado (p/ área do quadrado): ");
        double l = console.nextDouble();
        System.out.print("Digite o valor do raio (p/ área do círculo): ");
        double r = console.nextDouble();
        
        double quadrado = l*l;
        double circulo = 3.14*(r*r);
        
        System.out.println("\nÁrea do quadrado: " +quadrado);
        System.out.println("Área do círculo: " +circulo);
        
        if (circulo>quadrado) {
            System.out.println("\nO círculo tem a maior área.");
        } else if (quadrado>circulo) {
            System.out.println("\nO quadrado tem a maior área.");
        } else {
            System.out.println("\nOs dois tem áreas iguais.");
        }
    }
}
