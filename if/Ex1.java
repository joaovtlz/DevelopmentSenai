package listaIF;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double n1,n2,n3,n4,n5,s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os valores: ");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        n4 = scanner.nextDouble();
        n5 = scanner.nextDouble();

        s = (n1+n2+n3+n4)/n5;
        System.out.println("A soma dos quatro primeiros valores divido pelo quinto valor é: " +s );
        scanner.close();

    }
}
