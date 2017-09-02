package Lista01Switch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        int nota100, nota50, nota10, nota5, nota1, qntd, valor;
        
        System.out.print("Insira um valor (R$): ");
        valor = leitor.nextInt();
        
        nota100 = valor/100;
        nota50 = (valor%100)/50;
        nota10 = ((valor%100)%50)/10;
        nota5 = (((valor%100)%50)%10)/5;
        nota1 = ((((valor%100)%50)%10)%5)/1;
        
        System.out.println(+nota100+ " notas de 100");
        System.out.println(+nota50+ " notas de 50");
        System.out.println(+nota10+ " notas de 10");
        System.out.println(+nota5+ " notas de 5");
        System.out.println(+nota1+ " notas de 1");
        
        
                
        /*switch(nota100) {
            case nota100:
                System.out.println(+nota100+ "notas de 100.");
        }*/

    }
}
