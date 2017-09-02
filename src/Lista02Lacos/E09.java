/* Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, 
o programa deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética 
destas notas. Utilize o laço WHILE. */
package Lista02Lacos;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int i = 1;
        double soma = 0;
        
        System.out.print("Quantidade de alunos: ");
        int qntd = Integer.parseInt(console.nextLine());
        
        while (i <=qntd) {
            System.out.printf("Nota do aluno %d: " ,i);
            double nota = Double.parseDouble(console.nextLine());
            soma = soma + nota;
            i = i + 1;
        }
        double media = soma / qntd;
        System.out.printf("Média das notas: %.2f\n" ,media);
    }
}
