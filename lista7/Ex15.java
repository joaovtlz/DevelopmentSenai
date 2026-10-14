package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int senha;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        senha = scan.nextInt();
        while(senha!=1234){
            System.out.print("Senha incorreta. Digite a senha: ");
            senha = scan.nextInt();
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Senha correta.",
                "Validação de Senha",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
