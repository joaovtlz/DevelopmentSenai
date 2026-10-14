package lista6While;

import javax.swing.*;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int base,expoente,contador,resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = scan.nextInt();
        System.out.print("Digite o expoente: ");
        expoente = scan.nextInt();
        resultado = 1;
        contador = 0;
        while(contador<expoente){
            resultado *= base;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O resultado da potência é "+resultado,
                "Potência",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
