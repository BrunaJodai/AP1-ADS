/* Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de
juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro,
custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro,
R$171,03. */
package Lista01Switch;

import java.util.Scanner;

public class Switch08 {

    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor da associação: ");
        double assoc = Double.parseDouble(console.nextLine());
        System.out.print("Mês atual: ");
        int mes = Integer.parseInt(console.nextLine());
        double juros = 0.05;

        double jan = assoc;
        double fev = (assoc * juros) + assoc;
        double mar = (fev * juros) + fev;
        double abr = (mar * juros) + mar;
        double mai = (abr * juros) + abr;
        double jun = (mai * juros) + mai;
        double jul = (jun * juros) + jun;
        double ago = (jul * juros) + jul;
        double set = (ago * juros) + ago;
        double out = (set * juros) + set;
        double nov = (out * juros) + out;
        double dez = (nov * juros) + nov;

        switch (mes) {
            case 1:
                System.out.printf("Total com multa: R$ %.2f\n", jan);
                break;
            case 2:
                System.out.printf("Total com multa: R$ %.2f\n", fev);
                break;
            case 3:
                System.out.printf("Total com multa: R$ %.2f\n", mar);
                break;
            case 4:
                System.out.printf("Total com multa: R$ %.2f\n", abr);
                break;
            case 5:
                System.out.printf("Total com multa: R$ %.2f\n", mai);
                break;
            case 6:
                System.out.printf("Total com multa: R$ %.2f\n", jun);
                break;
            case 7:
                System.out.printf("Total com multa: R$ %.2f\n", jul);
                break;
            case 8:
                System.out.printf("Total com multa: R$ %.2f\n", ago);
                break;
            case 9:
                System.out.printf("Total com multa: R$ %.2f\n", set);
                break;
            case 10:
                System.out.printf("Total com multa: R$ %.2f\n", out);
                break;
            case 11:
                System.out.printf("Total com multa: R$ %.2f\n", nov);
                break;
            case 12:
                System.out.printf("Total com multa: R$ %.2f\n", dez);
                break;
            default:
                System.out.println("Mês inválido.");
        }
    }

}