package Lista02Lacos;

import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 2, n;
        double resultp = 0, resultn = 1;

        System.out.print("Valor de N: ");
        n = Integer.parseInt(console.nextLine());

        while (i <= n) {
            if (i % 2 == 0) {
                resultn = resultn - (1 / i);
            } else {
                resultp = resultp + (1 / i);
            }
            i = i + 1;
        }
        System.out.println("Resultado: " + (resultn + resultp));
    }
}
