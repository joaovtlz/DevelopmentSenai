package Ex.ExIF4;
import javax.swing.*;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
                int numero, primeiros, ultimos, soma, resultado;
                Scanner scan = new Scanner(System.in);
                System.out.print("Insira um número de 4 dígitos: ");
                numero = scan.nextInt();
                primeiros = numero / 100;
                ultimos = numero % 100;
                soma = primeiros + ultimos;
                resultado = soma * soma;
                javax.swing.JFrame frame = new javax.swing.JFrame();
                frame.setAlwaysOnTop(true);
                if(numero>9999 || numero<1000){
                    javax.swing.JOptionPane.showMessageDialog(frame,
                            "Número inválido.",
                            "Número mágico",
                            JOptionPane.QUESTION_MESSAGE);
                }
                else{
                if (resultado == numero) {
                    javax.swing.JOptionPane.showMessageDialog(frame,
                            "O número " + numero + " é mágico!",
                            "Número mágico",
                            JOptionPane.QUESTION_MESSAGE);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(frame,
                            "O número " + numero + " não é mágico!",
                                "Número mágico",
                            JOptionPane.QUESTION_MESSAGE);
                }}
                scan.close();
                System.exit(0);
            }
        }

