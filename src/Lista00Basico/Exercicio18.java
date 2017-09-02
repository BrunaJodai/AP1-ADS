package Lista00Basico;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        double n1, n2, n3, a=0, b=0, c=0;

        System.out.print("Primeiro valor: ");
        n1 = console.nextDouble();
        System.out.print("Segundo valor: ");
        n2 = console.nextDouble();
        System.out.print("Terceiro valor: ");
        n3 = console.nextDouble();

        if (n1>=n2 && n1>=n3) {
            a = n1;
            if (n2>=n3) {
                b = n2;
                c = n3;
            } else {
                b = n2;
                c = n3;
            }
        }
        if (n2>=n1 && n2>=n3) {
            a = n2;
            if (n1>=n3) {
                b = n1;
                c = n3;
            } else {
                b = n3;
                c = n2;
            }
        }
        if (n3>=n1 && n3>=n2) {
            a = n3;
            if (n1>=n2) {
                b = n1;
                c = n2;
            } else {
                b = n2;
                c = n1;
            }
        }
        if (n1==n2 && n2==n3 && n3==n1) {
            a=n1;
            b=n2;
            c=n3;
        }
          
        System.out.println("\nValores em ordem decrescente:");
        System.out.println("Valor de A: " +a);
        System.out.println("Valor de B: " +b);
        System.out.println("Valor de C: " +c+ "\n");
        
        double aa = a * a;
        double bb = b * b;
        double cc = c * c;

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (aa == bb + cc) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (aa > bb + cc) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (aa < bb + cc) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && a == c && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && a != c || b == c && b != a || c == a && c != b) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
