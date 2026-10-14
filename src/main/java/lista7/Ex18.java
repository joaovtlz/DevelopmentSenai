package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int n,contador,maiores,menores;
        Scanner scan = new Scanner(System.in);
        contador = 1;
        maiores = 0;
        menores = 0;
        while(contador<=10){
            System.out.print("Digite um numero: ");
            n = scan.nextInt();
            if(n>50){
                maiores++;
            }
            if(n<20){
                menores++;
            }
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Números maiores que 50: "+maiores+"\nNúmeros menores que 20: "+menores,
                "Contador",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
