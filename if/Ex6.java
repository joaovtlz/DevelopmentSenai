package listaIF;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int a, r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número.");
        a = sc.nextInt();
        r = a*a;

        System.out.println(a + " ao quadrado é " + r);
        sc.close();

    }
}
