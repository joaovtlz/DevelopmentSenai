package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int n,contador;
        double soma,media;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        soma = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(n>100){
                soma += n;
                contador++;
            }
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(contador>0){
            media = soma/contador;
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "A média dos números maiores que 100 é "+media,
                    "Média Condicionada",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Nenhum número maior que 100 foi informado.",
                    "Média Condicionada",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
