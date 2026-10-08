package listaRevisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número. ");
        a = sc.nextInt();
        System.out.print("Insira o segundo número. ");
        b = sc.nextInt();
        System.out.print("Insira o terceiro número. ");
        c = sc.nextInt();

        if (a>b && a>c) {
            System.out.printf("O maior número é: %d%n ", a);
        }
        else if (b>c) {
            System.out.printf("O maior número é: %d%n ", b);
        }
        else {
            System.out.printf("O maior número é: %d%n ", c);
        }
        sc.close();

    }
}
