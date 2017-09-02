/* Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade
expressa em dias. */
package Lista03Funcoes;

import java.util.Scanner;

public class Ex09 {
    static Scanner console = new Scanner (System.in);
    
    static int anos() {     
        System.out.print("IDADE \n"
                + "Anos: ");
        int anos = Integer.parseInt(console.nextLine());
        return anos;
    }
    
    static int meses () {
        System.out.print("Meses: ");
        int meses = Integer.parseInt(console.nextLine());
        
        return meses;
    }
    
    static int dias () {
        System.out.print("Dias: ");
        int dias = Integer.parseInt(console.nextLine());
        
        return dias;
    }
    
    static int iddDias (int anos, int meses, int dias) {
        int anoMes = anos*12;
        int mesDias = (meses+anoMes)*30;
        int iddDias = mesDias + dias;
        
        return iddDias;
    }
    
    public static void main(String[] args) {
        int anos = anos();
        int meses = meses();
        int dias = dias();
        int iddDias = iddDias(anos, meses, dias);
        
        System.out.println("Idade convertida só em dias: " +iddDias);
    }
}
