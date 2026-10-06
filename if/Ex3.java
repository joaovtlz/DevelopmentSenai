package listaIF;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String n;
        int n1, n2;
        double s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        n = sc.nextLine();
        System.out.println("Insira o 1º valor: ");
        n1 = sc.nextInt();
        System.out.println("Insira o 2º valor: ");
        n2 = sc.nextInt();

        s = (double)n1/n2;

        Locale.setDefault(Locale.US);
        System.out.print("O nome é " + n + " e a divisão dos valores é ");
        System.out.printf("%.2f%n",s);

        sc.close();
    }
}
