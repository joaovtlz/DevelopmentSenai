package listaIF;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int a, b;
        double t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        a = sc.nextInt();
        System.out.println("Insira o segundo número");
        b = sc.nextInt();
        t = (double) ((a * 2) + (b * 3))/5;

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "A média ponderada entre as notas é " + t,
                "Exercicio 9",
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        sc.close();
    }
}
