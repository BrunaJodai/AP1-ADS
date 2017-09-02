package Lista00Basico;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Lado A do triângulo retângulo: ");
        double a = console.nextInt();
        System.out.print("Lado B do triângulo retângulo: ");
        double b = console.nextInt();

        double hipotenusa = Math.sqrt(a * a + b * b);

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
