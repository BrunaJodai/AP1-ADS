package Lista01Switch;

import java.util.Scanner;

public class Switch05 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        String mes;

        System.out.print("Digite o mês: ");
        mes = leitor.nextLine();
        
        mes = mes.toLowerCase();

        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "fevereiro":
            case "junho":
            case "julho":
                System.out.println("Alta temporada.");
                break;
            case "março":
            case "abril":
            case "maio":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("Baixa temporada.");
                break;
            default:
                System.out.println("Mês inválido.");
        }
    }
}
