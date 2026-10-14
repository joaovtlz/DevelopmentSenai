package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int n,contador,soma;
        double media;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        soma = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            soma += n;
            contador++;
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(contador>0){
            media = (double)soma/contador;
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Quantidade de números: "+contador+"\nSoma total: "+soma+"\nMédia: "+media,
                    "Soma Acumulada",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Nenhum numero foi informado.",
                    "Soma Acumulada",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
