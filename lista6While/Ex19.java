package lista6While;

import javax.swing.*;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int idade,contador,soma;
        double media;
        Scanner scan = new Scanner(System.in);
        soma = 0;
        contador = 0;
        System.out.print("Digite uma idade (0 para encerrar): ");
        idade = scan.nextInt();
        while(idade!=0){
            soma += idade;
            contador++;
            System.out.print("Digite uma idade (0 para encerrar): ");
            idade = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(contador>0){
            media = (double)soma/contador;
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "A média das idades é "+media,
                    "Média de Idades",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Nenhuma idade foi informada.",
                    "Média de Idades",
                    JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
