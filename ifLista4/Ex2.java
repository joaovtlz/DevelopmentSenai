package listaRevisao;

import java.util.Scanner;

public class Ex2 {
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
            System.out.println("Os valores podem formar um triângulo.");
        }
        else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
        sc.close();
    }


}
