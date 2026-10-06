package listaIF;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int a, d, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        a = sc.nextInt();
        d = a*2;
        t = a*3;

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "O dobro de " + a + " é " + d + "\n" + "O triplo de " + a + " é " + t,
                "Exercicio 9" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        sc.close();
    }
}
