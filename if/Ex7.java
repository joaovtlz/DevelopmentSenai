package listaIF;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número");
        a = sc.nextInt();

        System.out.println("O antecessor de " + a + " é " + (a-1) + ", e o sucessor é " + (a+1));
        sc.close();
    }
}
