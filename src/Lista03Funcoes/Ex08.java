/* Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna Verdadeiro 
caso o valor seja primo, e Falso , caso contrário. Para isso, você terá que usar o tipo de retorno 
boolean. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex08 {

    static int lerNum() {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor: ");
        int num = Integer.parseInt(console.nextLine());

        return num;
    }

    public static boolean verPrimo(int n) {
        int cont = 0;
        boolean confere = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }

        confere = cont == 2;

        return confere;
    }

    static void imprime(boolean numPrimo) {
        if (numPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    public static void main(String[] args) {
        int n = lerNum();
        boolean verPrimo = verPrimo(n);
        imprime(verPrimo);
    }
}
