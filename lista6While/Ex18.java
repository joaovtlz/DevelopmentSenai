package lista6While;

import javax.swing.*;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int anos;
        double cidadeA,cidadeB;
        Scanner scan = new Scanner(System.in);
        cidadeA = 1000;
        cidadeB = 1500;
        anos = 0;
        while(cidadeA<=cidadeB){
            cidadeA *= 1.02;
            cidadeB *= 1.01;
            anos++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A cidade A passará a cidade B em "+anos+" anos.",
                "Crescimento Populacional",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
