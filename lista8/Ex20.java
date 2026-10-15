package lista8;

import javax.swing.*;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int valor,moedas25,moedas10,moedas5,moedas1;
        Scanner scan = new Scanner(System.in);
        moedas25 = 0;
        moedas10 = 0;
        moedas5 = 0;
        moedas1 = 0;
        System.out.print("Digite o valor em centavos: ");
        valor = scan.nextInt();
        if(valor>=25){
            do {
                valor -= 25;
                moedas25++;
            } while(valor>=25);
        }
        if(valor>=10){
            do {
                valor -= 10;
                moedas10++;
            } while(valor>=10);
        }
        if(valor>=5){
            do {
                valor -= 5;
                moedas5++;
            } while(valor>=5);
        }
        if(valor>=1){
            do {
                valor -= 1;
                moedas1++;
            } while(valor>=1);
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Moedas de 25 centavos: "+moedas25+
                        "\nMoedas de 10 centavos: "+moedas10+
                        "\nMoedas de 5 centavos: "+moedas5+
                        "\nMoedas de 1 centavo: "+moedas1,
                "Calculadora de Troco",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
