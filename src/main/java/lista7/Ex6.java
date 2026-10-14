package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int n,maior,menor,contador;
        Scanner scan = new Scanner(System.in);
        contador = 0;
        maior = 0;
        menor = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(contador==0){
                maior = n;
                menor = n;
            } else {
                if(n>maior){
                    maior = n;
                }
                if(n<menor){
                    menor = n;
                }
            }
            contador++;
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(contador==0){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Nenhum numero foi informado.",
                    "Maior e Menor",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Maior valor: "+maior+"\nMenor valor: "+menor,
                    "Maior e Menor",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
