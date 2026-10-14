package listaIfElse_2;

import javax.swing.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
    int v1, v2, p1, p2;
    Scanner scan  = new Scanner(System.in);
        System.out.print("Jogador 1, insira seu número de vitórias: ");
        v1 = scan.nextInt();
        System.out.print("Jogador 2, insira seu número de vitórias: ");
        v2 = scan.nextInt();
        p1=v1*10;
        p2=v2*5;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Vitórias do jogador 1: "+v1+"\nVitórias do jogador 2: "+v2+"" +
                "\nPontuação do jogador 1: "+ p1+ "\nPontuação do jogador 2: "+p2,
                "Pontuações",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
