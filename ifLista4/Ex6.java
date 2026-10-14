package listaRevisao;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double a, b;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número. ");
        a = sc.nextDouble();
        System.out.println("Insira outro número. ");
        b = sc.nextDouble();
        System.out.println("Insira a operação matemática desejada. ");
        s = sc.next();

        if (s.equals("+")) {
            System.out.println(a + b);
        } else if (s.equals("-")) {
            System.out.println(a - b);
        } else if (s.equals("*")) {
            System.out.println(a * b);
        }else {
            System.out.println(a / b);
        }sc.close();

        }
    }