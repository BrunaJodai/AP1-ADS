/* Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre 
na tela o número e o salário do funcionário. */
package Lista00Basico;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Número de cadastro do funcionário: ");
        int cad = console.nextInt();
        System.out.print("Horas trabalhadas: ");
        double h = console.nextDouble();
        System.out.print("Valor por hora: ");
        double valor = console.nextDouble();

        double salario = h * valor;

        System.out.printf("\nFuncionário: %s \nSalário: R$%.2f\n",cad ,salario);

    }
}
