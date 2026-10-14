package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int n,contador;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(n>=10 && n<=50){
                contador++;
            }
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Quantidade de valores entre 10 e 50: "+contador,
                "Intervalo Numérico",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
