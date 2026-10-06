package listaIF;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n1,n2,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira dois valores:");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        sum = n1+n2;
        System.out.println("A soma dos dois valores é: " + sum);
        scan.close();
    }
}
