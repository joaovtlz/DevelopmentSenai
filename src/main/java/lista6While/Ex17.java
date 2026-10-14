package lista6While;

import javax.swing.*;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int n,contador,fatorial;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = scan.nextInt();
        fatorial = 1;
        contador = 1;
        while(contador<=n){
            fatorial *= contador;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O fatorial de "+n+" é "+fatorial,
                "Fatorial",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
