/* Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X elevado a Z 
( sem utilizar funções ou operadores de potência prontos ). */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex15 {
    static Scanner console = new Scanner (System.in);
    
    static int x () {
        System.out.print("Valor de x (base): ");
        int x = Integer.parseInt(console.nextLine());
        
        return x;
    }
    
    static int z () {
        System.out.print("Valor de z (expoente): ");
        int z = Integer.parseInt(console.nextLine());
        
        return z;
    }
    
    static int pot (int x, int z) {
        int potencia = 1;
        for (int i = 1; i <= z; i++) {
            potencia = potencia * x;
        }
        return potencia;
    }
    
    public static void main(String[] args) {
        int x = x();
        int z = z();
        int pot = pot(x, z);
        
        System.out.println("Resultado: " +pot);
    }
}
