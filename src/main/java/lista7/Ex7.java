package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n,contador,soma;
        Scanner scan = new Scanner(System.in);
        soma = 0;
        contador = 1;
        while(contador<=8){
            System.out.print("Digite um numero: ");
            n = scan.nextInt();
            if(n>50){
                soma += n;
            }
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos números maiores que 50 é "+soma,
                "Soma",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
