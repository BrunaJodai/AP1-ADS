package Lista01Switch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner (System.in);
        int num, result;
        
        System.out.print("Informe um número: ");
        num = leitor.nextInt();
        
        result = num%3;
        
        switch (result) {
            case 0: 
                System.out.println("O número é divisível por 3.");
                break;
            default:
                System.out.println("O número não é divisível por 3.");
        }

    }

}
