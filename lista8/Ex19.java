package lista8;

import javax.swing.*;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int secreto,palpite;
        Scanner scan = new Scanner(System.in);
        secreto = 42;
        do {
            System.out.print("Digite um numero: ");
            palpite = scan.nextInt();
            if(palpite%2==0){
                System.out.println("O numero é par.");
            } else {
                System.out.println("O numero é impar.");
            }
            if(palpite>secreto){
                System.out.println("O numero é maior que o secreto.");
            } else if(palpite<secreto){
                System.out.println("O numero é menor que o secreto.");
            }
        } while(palpite!=secreto);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Parabens! Voce acertou o numero secreto: "+secreto,
                "Jogo de Adivinhacao",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
