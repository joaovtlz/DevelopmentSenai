package Lista2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double v,vf,vd,d;
        System.out.println("Insira o valor total da compra: ");
        Scanner scan = new Scanner(System.in);
        v = scan.nextDouble();
        scan.close();

        if(v<=200){
          d = 0.05;
        } else if (v<=500) {
            d = 0.10;
        }
        else {
            d = 0.15;
        }
        vf = (v-(v*d));
        vd = v-vf;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "Valor da compra: R$"+v
                        +"\nDesconto aplicado:  R$" + vd
                        + "\nValor final: R$"+vf,
                "Valor de compra" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);



        System.exit(0);
    }
}
