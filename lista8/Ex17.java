package lista8;

import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {
        int n,soma;
        n = 1;
        soma = 0;
        do {
            if(n%3==0 || n%5==0){
                soma += n;
            }
            n++;
        } while(n<=100);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos multiplos de 3 e 5 é "+soma,
                "Soma dos Multiplos",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(0);
    }
}
