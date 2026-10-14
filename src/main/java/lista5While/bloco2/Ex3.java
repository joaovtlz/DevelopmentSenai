package lista5While.bloco2;

import javax.swing.*;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double nota,soma,media;
        int contador;
        Scanner scan = new Scanner(System.in);
        soma = 0;
        contador = 1;
        while(contador<=5){
            System.out.print("Digite a nota: ");
            nota = scan.nextDouble();
            soma += nota;
            contador++;
        }
        media = soma / 5;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A média das notas é "+media,
                "Média",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
