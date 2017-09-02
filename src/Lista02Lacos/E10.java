
package Lista02Lacos;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double result = 1;
        
        for (int i = 2; i <= 20; i++) {
            result = result + (1/i);
            System.out.println("Resultado: " +i);
        }
        System.out.println("Resultado: " +result);
    }
}
