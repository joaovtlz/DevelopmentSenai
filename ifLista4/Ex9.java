package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        char letra;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma letra: ");
        letra = scan.next().charAt(0);
        letra = Character.toLowerCase(letra);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(letra!='a' && letra!='e' && letra!='i' && letra!='o' && letra!='u'){
            letra = Character.toUpperCase(letra);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "A letra " + letra + " é uma consoante.",
                    "Letra",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else{
            letra = Character.toUpperCase(letra);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "A letra " + letra + " é uma vogal.",
                    "Letra",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);

    }
}
