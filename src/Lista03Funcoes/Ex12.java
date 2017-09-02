/* Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa, e retorna 
o seu peso ideal.
Para homens, você calcular o peso ideal usando a fórmula: P = 72,7 * altura - 58.
Para mulheres, utilize a fórmula: P = 62,1 * altura – 44,7. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex12 {
    static Scanner console = new Scanner (System.in);
    
    static double altura () {
        System.out.print("Altura: ");
        double altura = Double.parseDouble(console.nextLine());
        
        return altura;
    }
    
    static int sexo() {
        System.out.print("Sexo: \n"
                + "1 - Homem; \n"
                + "2 - Mulher. \n"
                + "Digite a opção: ");
        int sexo = Integer.parseInt(console.nextLine());
        
        return sexo;
    }
    
    static double pesoIdeal (double altura, int sexo) {
        double peso = 0;
        
        switch (sexo) {
            case 1:
                peso = 72.7 * altura - 58;
                break;
            case 2:
                peso = 62.1 * altura - 44.7;
                break;
        }
        
        return peso;
    }
    
    
    public static void main(String[] args) {
        double alt = altura();
        int sexo = sexo();
        double peso = pesoIdeal(alt, sexo);
        
        System.out.println("O peso ideal é: " +peso);
    }
}
