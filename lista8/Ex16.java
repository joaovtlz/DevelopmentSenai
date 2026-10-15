package lista8;

import javax.swing.*;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int n,divisor,contador;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        System.out.print("Digite um numero: ");
        n = scan.nextInt();
        divisor = 1;
        do {
            if(n%divisor==0){
                contador++;
            }
            divisor++;
        } while(divisor<=n && n>0);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(n>1 && contador==2){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O numero "+n+" é primo.",
                    "Numeros Primos",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O numero "+n+" nao é primo.",
                    "Numeros Primos",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
