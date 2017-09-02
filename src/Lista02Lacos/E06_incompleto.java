/* Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados
como nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE*/

//ARRUMAR --- TUDO ERRADO

package Lista02Lacos;

import java.util.Scanner;

public class E06_incompleto {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int i = 1, idade = 0;
        String nome1 = "", sexo1 = "", nome = "", sexo = "";
        
        //for (i = 1; i<=5; i++) {
            
        //}
        
        do {
            
            int idda = idade;
            
            if (idade < idda) {
                nome1 = nome;
                sexo1 = sexo;
            }
            
            System.out.print("Nome: ");
            nome = console.nextLine();
            System.out.print("Idade: ");
            idade = Integer.parseInt(console.nextLine());
            System.out.print("Sexo: ");
            sexo = console.nextLine();
            
            i = i + 1;
            
        } while (i<=2);
        System.out.println("DADOS DO ALUNO MAIS VELHO");
        System.out.println("Nome: " +nome1);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: ");
    }
            
}