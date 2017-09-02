package Lista01Switch;

import java.util.Scanner;

public class Switch07_v2 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        int opcao, valor;
        int fixo = 100;

        System.out.println("Idade do conveniado:");
        System.out.println("(1) Crianças com menos de 10 anos.");
        System.out.println("(2) Entre 10 e 30 anos.");
        System.out.println("(3) Entre 30 e 60 anos.");
        System.out.println("(4) Mais de 60 anos.\n");
        System.out.print("Digite a opção em que se encaixa: ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                valor = fixo + 80;
                System.out.println("Conveniado irá pagar: " + valor);
                break;
            case 2:
                valor = fixo + 50;
                System.out.println("Conveniado irá pagar: " + valor);
                break;
            case 3:
                valor = fixo + 95;
                System.out.println("Conveniado irá pagar: " + valor);
                break;
            case 4:
                valor = fixo + 130;
                System.out.println("Conveniado irá pagar: " + valor);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
