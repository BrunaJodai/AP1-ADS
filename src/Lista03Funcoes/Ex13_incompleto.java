/* Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de 
divisores desse valor. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex13_incompleto {

    static int lerNum() {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor: ");
        int num = Integer.parseInt(console.nextLine());

        return num;
    }

    static int divi(int n) {
        int divi = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divi = divi + 1;
            }
        }

        return divi;
    }

    public static void main(String[] args) {
        int n = lerNum();
        int divi = divi(n);
        System.out.println("Número de divisores é " + divi);
    }
}
