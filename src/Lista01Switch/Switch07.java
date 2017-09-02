package Lista01Switch;

import java.util.Scanner;

public class Switch07 {

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        int idade, valor=0;
        String faixa="faixa";

        System.out.print("Informe a idade do conveniado: ");
        idade = leitor.nextInt();

        if (idade < 10) {
            faixa = "crianca";
            valor = 100 + 80;
        } else if (idade >= 10 && idade < 30) {
            faixa = "1030";
            valor = 100 + 50;
        } else if (idade >= 30 && idade < 60) {
            faixa = "3060";
            valor = 100 + 95;
          /*Na questão estava marcado idade entre 40 e 60, porém ficaria um buraco entre
            31 e 39 anos, então aumentei o intervalo de idade nessa.*/
        } else if (idade >= 60) {
            faixa = "60";
            valor = 100 + 130;
        }

        switch (faixa) {
            case "crianca":
                System.out.println("Conveniado irá pagar: R$" +valor);
                break;
            case "1030":
                System.out.println("Conveniado irá pagar: R$" +valor);
                break;
            case "3060":
                System.out.println("Conveniado irá pagar: R$" +valor);
                break;
            case "60":
                System.out.println("Conveniado irá pagar: R$" +valor);
                break;
            default:
                System.out.println("Entrada inválida.");
        }
    
}
}
