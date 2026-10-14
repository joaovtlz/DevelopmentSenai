package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scan.nextDouble();
        while(nota<0 || nota>10){
            System.out.print("Nota inválida. Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Nota digitada: "+nota,
                "Validação de Nota",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
