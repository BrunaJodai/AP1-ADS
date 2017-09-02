
package Lista01Switch;

import java.util.Scanner;


public class Switch02 {
    public static void main (String []arg) {
        Scanner leitor = new Scanner (System.in);
        int dia;
        
        System.out.print("Informe um dia (1-7): ");
        dia = leitor.nextInt();
        
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("Dia inválido.");
        }
    }
    
}
