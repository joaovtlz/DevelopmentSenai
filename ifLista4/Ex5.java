package listaRevisao;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número. ");
        a = sc.nextInt();

        if (a>=100 && a<=200){
            System.out.println("O número " + a + " está entre 100 e 200." );
        } else if (a<100) {
            System.out.println("O número é menor que 100.");
        } else {
            System.out.println("O número é maior que 200.");
            sc.close();
        }

    }
}
