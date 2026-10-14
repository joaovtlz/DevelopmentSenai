package Ex.ExIF4;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double peso,altura,imc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu peso em kg: ");
        peso = scan.nextDouble();
        System.out.print("Insira sua altura em centímetros: ");
        altura = scan.nextDouble();
        altura = altura/100;
        imc=peso/(altura*altura);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        if(imc<18.5){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Seu IMC é: " + String.format("%.2f", imc) + "\nVocê está abaixo do peso.",
                    "IMC" ,
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }
        else if(imc<25){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Seu IMC é: " + String.format("%.2f", imc) + "\nVocê está no peso ideal.",
                    "IMC" ,
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }
        else if(imc>=25){
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Seu IMC é: " + String.format("%.2f", imc) + "\nVocê está no sobrepeso.",
                    "IMC" ,
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
        System.exit(0);
    }
}
