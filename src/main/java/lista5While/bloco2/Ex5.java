package lista5While.bloco2;

import javax.swing.*;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int contador;
        String resultado;
        contador = 1;
        resultado = "";
        while(contador<=10){
            resultado += "7 x "+contador+" = "+(7*contador)+"\n";
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                resultado,
                "Tabuada do 7",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(0);
    }
}
