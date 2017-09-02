package LacosRepeticao_Exemplos;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        
        while (i<10) {
            System.out.println("ALGORITMOS I - Linha :" +i);
            i = i + 1; //incremento feito de forma explicita
        }
    }
}