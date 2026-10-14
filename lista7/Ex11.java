package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double valor;
        int contador;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        valor = scan.nextDouble();
        contador = 0;
        while(valor<=1000){
            valor *= 1.05;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Quantidade de repetições: "+contador,
                "Crescimento de Valor",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
