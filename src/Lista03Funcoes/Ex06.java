/* Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros de entrada reais 
a , b , c , um quarto parâmetro d deve ser adicionado.
Esse parâmetro poderá ter dois valores: 1 ou 2.
Ele será responsável para decidir se a saída da função vai ser a maior ou a menor raiz (no caso 
de raízes iguais, considere a maior raiz). Considere que 1 serve para obter a maior raiz e 2 
para obter a menor raiz.
Novamente, se não houver raízes reais, a função deve retornar o número −1. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex06 {
    static Scanner console = new Scanner(System.in);
    
    static double lerNum() {
        System.out.print("Valor: " );
        double num = Double.parseDouble(console.nextLine());

        return num;
    }
    static int escolha() {
        System.out.print("Escolha a raíz da equação que deseja visualizar:\n"
                + "1 - Maior raíz; \n"
                + "2 - Menor raíz. \n"
                + "Digite a opção: ");
        int escolha = Integer.parseInt(console.nextLine());
        return escolha;
    }
    
    static double saida(double a, double b, double c, int d) {
        double saida = 0;
        switch (d) {
            case 1:
                saida = maiorRaiz(a,b,c);
                break;
            case 2:
                saida = menorRaiz(a,b,c);
                break;
            default:
                System.out.println("Escolha inválida");
        }
        return saida;
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
    
    static double menorRaiz(double a, double b, double c) {
        double menorRaiz = 0;
        double delta = (b * b) - 4 * a * c;
        //System.out.println("delta: " +delta);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            //System.out.println("x1 " +x1);
            //System.out.println("x2 " +x2);

            if (x1 <= x2) {
                menorRaiz = x1;
            } else if (x2 < x1) {
                menorRaiz = x2;
            }
        } else {
            menorRaiz = -1;
        }

        return menorRaiz;
    }

    public static void main(String[] args) {
        System.out.println("Dê os valores pra a, b e c, respectivamente, da equação de 2° grau:");
        System.out.println("ax2 + bx + c \n");
        double a = lerNum();
        double b = lerNum();
        double c = lerNum();
        int d = escolha();
        double saida = saida(a,b,c,d);
        
        System.out.println("Saída: " +saida);
    }
}
