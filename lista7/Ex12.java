package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        double n;
        int contador;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero maior que 1: ");
        n = scan.nextDouble();
        contador = 0;
        while(n>1){
            n /= 2;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Quantidade de divisões: "+contador,
                "Divisão",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
