package listaIfElse_2;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double sb,sl,imp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu salário bruto: ");
        sb=scan.nextDouble();
        imp=sb*0.10;
        sl=sb-imp;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Salário Bruto: "+sb+
                "\nImposto de 10%: "+imp+
                "\nSalário Líquido: "+sl,
                "Salário",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
