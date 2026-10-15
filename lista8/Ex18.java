package lista8;

import javax.swing.*;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int n,contador,ultimo;
        String resultado;
        Scanner scan = new Scanner(System.in);
        contador = 1;
        resultado = "";
        do {
            System.out.print("Digite um numero inteiro: ");
            n = scan.nextInt();
            ultimo = n%10;
            if(ultimo<0){
                ultimo = ultimo*-1;
            }
            if(ultimo==0){
                resultado += n+": ultimo digito 0\n";
            } else if(ultimo==5){
                resultado += n+": ultimo digito 5\n";
            } else {
                resultado += n+": outro digito\n";
            }
            contador++;
        } while(contador<=10);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                resultado,
                "Classificacao dos Numeros",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
