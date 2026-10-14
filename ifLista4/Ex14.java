package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        double salario,imp;
        String pc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu salário: ");
        salario = scan.nextDouble();
        if(salario<=2000){
            imp = 0;
            salario *= imp;
        }
        else if(salario<=5000){
            imp = 0.10;
            salario *= imp;
        }
        else{
            imp = 0.20;
            salario *= imp;
        }
        pc = (imp*100)+"%";
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O imposto sobre o salário é de "+ pc + ", R$"+salario,
                "Cálculo de imposto",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
