/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, calcular e imprimir o total a receber no final do mês.*/
package Lista00Basico;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String vendedor = console.nextLine();
        System.out.print("Salário fixo: ");
        double salfixo = console.nextDouble();
        System.out.print("Total de vendas no mês (dinheiro): ");
        double vendas = console.nextDouble();

        double salfinal = (0.15 * vendas) + salfixo;

        System.out.println("Total a receber no final do mês: " +salfinal);
    }
}
