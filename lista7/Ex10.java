package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int n,somaPares,somaImpares;
        Scanner scan = new Scanner(System.in);
        somaPares = 0;
        somaImpares = 0;
        System.out.print("Digite um numero (0 para encerrar): ");
        n = scan.nextInt();
        while(n!=0){
            if(n%2==0){
                somaPares += n;
            } else {
                somaImpares += n;
            }
            System.out.print("Digite um numero (0 para encerrar): ");
            n = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Soma dos números pares: "+somaPares+"\nSoma dos números ímpares: "+somaImpares,
                "Somas",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
