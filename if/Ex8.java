package listaIF;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int a, b, r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o 1º valor: ");
        a = sc.nextInt();
        System.out.println("Insira o 2º valor: ");
        b = sc.nextInt();
        sc.nextLine();
        r = a % b;
        System.out.println("O resto é " +r);
        sc.close();
    }
}
