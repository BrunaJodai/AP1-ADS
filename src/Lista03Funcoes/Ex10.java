/* Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, 
a categoria desse nadador (tipo String) de acordo com a tabela abaixo:
Idade                          || Categoria
5 a 7 anos                     || Infantil A
8 a 10 anos                    || Infantil B
11-13 anos                     || Juvenil A
14-17 anos                     || Juvenil B
Maiores de 18 anos (inclusive) || Adulto */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex10 {
    
    static int idade() {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Idade do nadador: ");
        int idade = Integer.parseInt(console.nextLine());
        
        return idade;
    }
    
    static String categoria (int idd) {
        String categoria = "";
        if (idd >= 5 && idd <= 7) {
            categoria = "Infantil A";
        } else if (idd >= 8 && idd <= 10) {
            categoria = "Infantil B";
        } else if (idd >= 11 && idd <= 13) {
            categoria = "Juvenil A";
        } else if (idd >= 14 && idd <= 17) {
            categoria = "Juvenil B";
        } else if (idd >= 18) {
            categoria = "Adulto";
        } else {
            categoria = "Inválida";
        }
        
        return categoria;
    }
    
    public static void main(String[] args) {
        int idd = idade();
        String categoria = categoria (idd);
        System.out.println("Categoria: " +categoria);
    }
}
