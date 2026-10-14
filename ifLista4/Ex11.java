package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int n, par, impar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número: ");
        n = scan.nextInt();
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if (n % 2 == 0) {
            if (n >= 100) {
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número " + n + " é par e maior que 100.",
                        "Par/Impar e Magnitude",
                        JOptionPane.QUESTION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número " + n + " é par e menor que 100.",
                        "Par/Impar e Magnitude",
                        JOptionPane.QUESTION_MESSAGE);
            }
        } else {
            if (n > 100) {
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número " + n + " é ímpar e maior que 100.",
                        "Par/Impar e Magnitude",
                        JOptionPane.QUESTION_MESSAGE);
            }
        else{
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número "+n+" é ímpar e menor que 100.",
                        "Par/Impar e Magnitude",
                        JOptionPane.QUESTION_MESSAGE);}
            }
        if(n==100){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número "+n+" é par e igual a 100.",
                    "Par/Impar e Magnitude",
                    JOptionPane.QUESTION_MESSAGE);}
        scan.close();
        System.exit(0);
        }
    }

