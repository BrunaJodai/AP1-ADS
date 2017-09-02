/* Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
while*/
package LacosRepeticao_Exercicios;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = 2;

        while (num > 1 && num <= 100) {
            System.out.println(num);
            num = num + 2;
        }
    }
}
