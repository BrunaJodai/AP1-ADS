package Lista01Switch;

import javax.swing.JOptionPane;

public class Switch07_v3 {

    public static void main(String[] arg) {
        int valor, fixo = 100;
        String opcao = JOptionPane.showInputDialog(null, "Digite a opção em que se encaixa a idade do conveniado:\n"
                + "(1) Crianças com menos de 10 anos.\n"
                + "(2) Entre 10 e 30 anos.\n"
                + "(3) Entre 30 e 60 anos.\n"
                + "(4) Mais de 60 anos.");

        switch (opcao) {
            case "1":
                valor = fixo + 80;
                JOptionPane.showMessageDialog(null, "Conveniado irá pagar: R$" + valor);
                break;
            case "2":
                valor = fixo + 50;
                JOptionPane.showMessageDialog(null, "Conveniado irá pagar: R$" + valor);
                break;
            case "3":
                valor = fixo + 95;
                JOptionPane.showMessageDialog(null, "Conveniado irá pagar: R$" + valor);
                break;
            case "4":
                valor = fixo + 130;
                JOptionPane.showMessageDialog(null, "Conveniado irá pagar: R$" + valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
