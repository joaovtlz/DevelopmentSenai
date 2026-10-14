package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int n,soma;
        Scanner scan = new Scanner(System.in);
        soma = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(n%2==0){
                soma += n;
            }
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos números pares é "+soma,
                "Soma dos Pares",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
