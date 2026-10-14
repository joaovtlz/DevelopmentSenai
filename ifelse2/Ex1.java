package listaIfElse_2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double np, na, mp;
        String r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota das provas.");
        np = sc.nextDouble();
        System.out.println("Insira a nota das atividades.");
        na = sc.nextDouble();

        mp = ((np*70)+(na*30))/100;

        if(mp<6){
            r = "Reprovado";
        }
        else {
            r = "Aprovado";
        }

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "Nota das Provas: " + np +
                        "\n" + "Nota das Atividades: " + na +
                        "\n" + "Média Final: " + mp +
                        "\n" +
                        "\n" + "Situação do Aluno: " + r,
                "Algoritmo Gestão Escolar" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        sc.close();

            }
}
