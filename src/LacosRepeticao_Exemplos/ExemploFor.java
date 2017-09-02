package LacosRepeticao_Exemplos;

import java.util.Scanner;

public class ExemploFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o item " + i + ": ");
            x = sc.nextInt(); //para acumular
            soma = soma + x;
        }
        System.out.println("TOTAL: " + soma);
    }
}