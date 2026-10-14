package lista5While.bloco2;

import javax.swing.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int contador,soma;
        soma = 0;
        contador = 2;
        while(contador<=50){
            soma += contador;
            contador += 2;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos números pares entre 1 e 50 é "+soma,
                "Soma",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(0);
    }
}
