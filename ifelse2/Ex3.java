package listaIfElse_2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double d, cm, qc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distância.");
        d = sc.nextDouble();
        System.out.println("Insira o consumo médio.");
        cm = sc.nextDouble();

        qc = d/cm;

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "Distância: " + d +
                        "\n" + "Consumo médio: " + cm +
                        "\n" + "Quantidade de combustível necessária: " + qc,
                "Algoritmo Gestão de Combustível" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        sc.close();

    }
}
