package listaIfElse_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int dia, mes, ano, datual,matual,aatual,idade;
        aatual=2026; matual=10; datual=5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o dia do seu nascimento: ");
        dia=scan.nextInt();
        System.out.println("Insira o mes do seu nascimento: ");
        mes=scan.nextInt();
        System.out.println("Insira o ano do seu nascimento: ");
        ano=scan.nextInt();
        idade = aatual-ano;
        if (mes>matual || (mes==matual && dia>datual)){
            idade--;
        } else{}
                javax.swing.JFrame frame = new javax.swing.JFrame();
                frame.setAlwaysOnTop(true);
        if(idade>=18){
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "Data de nascimento: " + dia +"/"+mes+"/"+ano+
                                "\n" + "Idade: " + idade +
                                "\n" + "Entrada permitida: Sim!",
                        "Status de entrada",
                        javax.swing.JOptionPane.QUESTION_MESSAGE);
            }
        else{
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Data de nascimento: " + dia +"/"+mes+"/"+ano+
                            "\n" + "Idade: " + idade +
                            "\n" + "Entrada permitida: Não!",
                    "Status de entrada",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }
        scan.close();
            System.exit(0);
    }
}
