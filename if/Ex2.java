package listaIF;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o 1º valor: ");
        n1 = sc.nextInt();
        System.out.println("Insira o 2º valor: ");
        n2 = sc.nextInt();
        System.out.println("Insira o 3º valor: ");
        n3 = sc.nextInt();
        System.out.println("Insira o 4º valor: ");
        n4 = sc.nextInt();

        s = (n1+n2+n3+n4)/4;

        System.out.println("O resultado da média aritmética é: " + s);
        sc.close();



    }
}
