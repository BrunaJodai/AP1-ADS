/* Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, 
onde o volume é dado por:
V = (4/3) * pi * r³       */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex07 {

    static double raio() {
        Scanner console = new Scanner(System.in);

        System.out.print("Raio da esfera: ");
        double raio = Double.parseDouble(console.nextLine());

        return raio;
    }

    static double volume(double r) {
        double volume = (4 / 3) * Math.PI * (r * r * r);
        return volume;
    }

    public static void main(String[] args) {
        double r = raio();
        double v = volume(r);

        System.out.printf("Volume: %.2f \n"  ,v);
    }
}
