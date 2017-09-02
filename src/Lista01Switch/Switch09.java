package Lista01Switch;

import java.util.Scanner;

public class Switch09 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String cond = "invalido";

        System.out.print("Digite o CPF: ");
        String cpf = leitor.nextLine();

        int n1 = Integer.parseInt(cpf.substring(0, 1));
        int n2 = Integer.parseInt(cpf.substring(1, 2));
        int n3 = Integer.parseInt(cpf.substring(2, 3));
        int n4 = Integer.parseInt(cpf.substring(3, 4));
        int n5 = Integer.parseInt(cpf.substring(4, 5));
        int n6 = Integer.parseInt(cpf.substring(5, 6));
        int n7 = Integer.parseInt(cpf.substring(6, 7));
        int n8 = Integer.parseInt(cpf.substring(7, 8));
        int n9 = Integer.parseInt(cpf.substring(8, 9));
        int n10 = Integer.parseInt(cpf.substring(9, 10));
        int n11 = Integer.parseInt(cpf.substring(10, 11));

        int soma1 = (n1 * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4) + (n8 * 3) + (n9 * 2);
        int restosoma1 = soma1 % 11;
        int subt1 = 11 - restosoma1;

        if (subt1 < 10 && subt1 == n10 || subt1 == 0) {
            int soma2 = (n1 * 11) + (n2 * 10) + (n3 * 9) + (n4 * 8) + (n5 * 7) + (n6 * 6) + (n7 * 5) + (n8 * 4) + (n9 * 3) + (n10 * 2);
            int restosoma2 = soma2 % 11;
            int subt2 = 11 - restosoma2;
            if (subt2 < 10 && subt2 == n11 || subt2 == 0) {
                cond = "valido";
            }
        }
        switch (cond) {
            case "valido":
                System.out.println("CPF válido.");
                break;
            default:
                System.out.println("CPF inválido.");
        }
    }
}