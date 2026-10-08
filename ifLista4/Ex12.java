package Ex.ExIF4;

import javax.swing.*;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        double valor, cod;
        String pag;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor do produto: ");
        valor = scan.nextDouble();
        System.out.print("\nInsira o código para forma de pagamento: ");
        cod = scan.nextDouble();
        // cod 1 = a vista 10% desc, cod 2 = cartao 5% desc, cod 3 = parcelamento 2x preço normal
        if (cod==1){
            valor-=(valor*0.10);
            pag = "à vista.";
        }
        else if(cod==2){
            valor-=(valor*0.05);
            pag = "cartão.";
        }
        else if (cod==3) {
        pag = "parcelamento em 2x.";
        }
        else{
            pag = "nenhuma.";
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O valor final do produto é "+valor+" e a forma de pagamento escolhida foi "+pag,
                "Valor de produto",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);

    }
}
