package Lista2;

import javax.swing.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int t;
        String a;
        System.out.print("Insira a temperatura: ");
        Scanner scan = new Scanner (System.in);
        t = scan.nextInt();
        if(t<18){
            a = "Ligar o aquecedor";
        }
        else if(t<=25){
            a = "Manter a temperatura atual";
        }
        else{
            a = "Ligar o ar condicionado";
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Temperatura: "+t+"\nAção recomendada: "+a,
                "Sugestão",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(0);

    }
}
