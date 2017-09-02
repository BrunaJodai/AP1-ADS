/* Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c 
e devolve (retorna) menor dentre os três números. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex01 {

    static int lerNum() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Digite o valor: ");
        num = Integer.parseInt(console.nextLine());

        return num;
    }

    static int numeros(int a, int b, int c) {
        int menor = 0;
        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else if (c < a && c < b) {
            menor = c;
        }
        return menor;
    }

    public static void main(String[] args) {
        int a = lerNum();
        int b = lerNum();
        int c = lerNum();
        int menor = numeros(a, b, c);
        System.out.println("O menor número é: " + menor);
    }

}
