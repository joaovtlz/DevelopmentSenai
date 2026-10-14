package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int i,f,d;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o horário de inicio do jogo: ");
        i = scan.nextInt();
        System.out.print("\nInsira o horário de término do jogo: ");
        f = scan.nextInt();
        if(f<i){
            d = 24-(i-f);
        }
        else{
            d = f-i;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(d>1){
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O jogo durou " + d + " horas.",
                "Duração do jogo",
                JOptionPane.QUESTION_MESSAGE);}
        else{
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O jogo durou " + d + " hora.",
                    "Duração do jogo",
                    JOptionPane.QUESTION_MESSAGE);}
        scan.close();
        System.exit(0);
    }
}
