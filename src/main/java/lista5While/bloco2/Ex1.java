package lista5While.bloco2;

public class Ex1 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        while(contador<=10){
            suma+=contador;
            contador++;
        }
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A soma dos números de 1 a 10 é: " + suma,
                "Soma dos números de 1 a 10" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        System.exit(0);
    }
}
