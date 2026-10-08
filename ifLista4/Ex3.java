package listaRevisao;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a dimensão do primeiro lado do triângulo. ");
        a = sc.nextInt();
        System.out.println("Insira a dimensão do segundo lado do triângulo. ");
        b = sc.nextInt();
        System.out.println("Insira a dimensão do segundo lado do triângulo. ");
        c = sc.nextInt();

        if (a<(b+c) && b<(a+c) && c<(a+b)){
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero (três lados iguais).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            } else {
                System.out.println("Triângulo Escaleno (três lados diferentes).");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
            sc.close();
        }
    }
}

