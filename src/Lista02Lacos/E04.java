/* Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR.*/
package Lista02Lacos;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        for (int i = 10; i <=1000; i = i + 10) {
            System.out.println(i);
        }
    }
}
