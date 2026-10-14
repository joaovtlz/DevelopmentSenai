package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o dia do seu nascimento: ");
        int dia = scan.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        int mes = scan.nextInt();
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Você é do signo de áries",
                    "Teste de signo",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Você não é do signo de áries",
                    "Teste de signo",
                    JOptionPane.QUESTION_MESSAGE);
        }

        scan.close();
        System.exit(0);

    }
}
