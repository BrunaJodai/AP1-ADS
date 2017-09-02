package Lista01Switch;

import java.util.Scanner;

public class Switch04 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        int mes, ano;

        System.out.print("Mês (1-12): ");
        mes = leitor.nextInt();
        System.out.print("Ano: ");
        ano = leitor.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês tem 31 dias.");
                break;
            case 2:
                if (ano % 4 == 0) {
                    System.out.println("O mês tem 29 dias.");
                } else {
                    System.out.println("O mês tem 28 dias.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês tem 30 dias.");
                break;
            default:
                System.out.println("Entrada inválida.");
        }
    }
}
