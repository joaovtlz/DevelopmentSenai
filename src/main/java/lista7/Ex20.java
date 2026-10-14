package lista7;

import javax.swing.*;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        double valor,total,finalCompra;
        Scanner scan = new Scanner(System.in);
        total = 0;
        System.out.print("Digite o valor do produto (0 para encerrar): ");
        valor = scan.nextDouble();
        while(valor!=0){
            total += valor;
            System.out.print("Digite o valor do produto (0 para encerrar): ");
            valor = scan.nextDouble();
        }
        finalCompra = total;
        if(total>500){
            finalCompra = total*0.90;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Total da compra: R$ "+total+"\nValor final: R$ "+finalCompra,
                "Caixa com Desconto",
                JOptionPane.QUESTION_MESSAGE);
        scan.close();
        System.exit(0);
    }
}
