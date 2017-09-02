/* Faça uma função que recebe a média final de um aluno por parãmetro e retorna o seu conceito, 
conforme a tabela abaixo:
Nota          || Conceito
de 0,0 a 4,9  || D
de 5,0 a 6,9  || C
de 7,0 a 8,9  || B
de 9,0 a 10,0 || A */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex11 {

    static double media() {
        Scanner console = new Scanner(System.in);

        System.out.print("Média final: ");
        double media = Double.parseDouble(console.nextLine());

        return media;
    }

    static String conceito(double media) {
        String conceito = "";
        if (media >= 0 && media <= 4.9) {
            conceito = "D";
        } else if (media >= 5 && media <= 6.9) {
            conceito = "C";
        } else if (media >= 7 && media <= 8.9) {
            conceito = "B";
        } else if (media >= 9 && media <= 10) {
            conceito = "A";
        } else {
            conceito = "Inválido";
        }
        return conceito;
    }

    public static void main(String[] args) {
        double media = media();
        String conceito = conceito(media);
        System.out.println("Conceito " +conceito);
    }
}
