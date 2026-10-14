package lista5While.bloco2;

import javax.swing.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n,contador,soma;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = scan.nextInt();
        soma = 0;
        contador = 1;
        while(contador<=n){
            soma += contador;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos números até "+n+" é "+soma,
                "Soma",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}