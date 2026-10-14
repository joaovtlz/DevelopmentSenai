package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int n,contador;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(n>=20 && n<=80){
                contador++;
            }
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Quantidade de valores entre 20 e 80: "+contador,
                "Intervalo",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
