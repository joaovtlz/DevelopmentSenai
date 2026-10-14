package lista6While;

import javax.swing.*;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int contador;
        String resultado;
        Scanner scan = new Scanner(System.in);
        contador = 1;
        resultado = "";
        while(contador<=15){
            resultado += "O quadrado de "+contador+" é "+(contador*contador)+"\n";
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                resultado,
                "Sequência de Quadrados",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
