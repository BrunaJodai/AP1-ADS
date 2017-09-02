package Lista00Basico;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = console.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = console.nextInt();

        System.out.println("O produto dos dois números é: " + num1 * num2);

    }

}
