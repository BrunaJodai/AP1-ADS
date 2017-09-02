package LacosRepeticao_Exemplos;

import java.util.Scanner;

public class ExemploDoWhile {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 0, j = 10;
        
        do {
            System.out.println(i + " é menor que " +j);
            i++;
        } while (i < j);
    }
}
