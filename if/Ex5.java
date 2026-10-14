package listaIF;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int a, b;
        double s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o 1º valor: ");
        a = sc.nextInt();
        System.out.println("Insira o 2º valor: ");
        b = sc.nextInt();
        sc.nextLine();
        s = a-b;
        System.out.println("O resultado é " +s);
        sc.close();
        }
    }
