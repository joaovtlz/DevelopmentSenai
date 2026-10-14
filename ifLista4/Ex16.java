package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número é divisivel por 2, 3 e 5.",
                    "Teste de divisibilidade",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número não é divisivel por 2, 3 e 5.",
                    "Teste de divisibilidade",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
