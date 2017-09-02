/* Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis. */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Base: ");
        int base = console.nextInt();
        System.out.print("Expoente: ");
        int exp = console.nextInt();

        System.out.println("Resultado: " + Math.pow(base, exp));
    }
}
