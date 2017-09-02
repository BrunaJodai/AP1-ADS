/* Fazer uma função que tem como parâmetros de entrada três números reais a , b , c e fornece 
como saída a maior raiz da equação do 2º grau:
ax2 + bx + c
Nesta questão, você deverá utilizar a fórmula de Báskara . Se não houver raízes reais, a função 
deve retornar o número −1. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex05 {

    static double lerNum() {
        Scanner console = new Scanner(System.in);
        double num;

        System.out.print("Valor: " );
        num = Double.parseDouble(console.nextLine());

        return num;
    }

    static double maiorRaiz(double a, double b, double c) {
        double maiorRaiz = 0;
        double delta = (b * b) - 4 * a * c;
        //System.out.println("delta: " +delta);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            //System.out.println("x1 " +x1);
            //System.out.println("x2 " +x2);

            if (x1 >= x2) {
                maiorRaiz = x1;
            } else if (x2 > x1) {
                maiorRaiz = x2;
            }
        } else {
            maiorRaiz = -1;
        }

        return maiorRaiz;
    }

    public static void main(String[] args) {
        System.out.println("Dê os valores pra a, b e c, respectivamente, da equação de 2° grau:");
        System.out.println("ax2 + bx + c \n");
        double a = lerNum();
        double b = lerNum();
        double c = lerNum();
        double maiorRaiz = maiorRaiz(a, b, c);
        
        System.out.printf("A maior raíz é %.2f \n" ,maiorRaiz);
    }
}
