package listaRevisao;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número. ");
        a = sc.nextInt();
        if (a%7 == 0 && a%11 == 0) {
            System.out.println("O número é multiplo de 7 e 11");
        }else if (a%7 == 0) {
            System.out.println("O número é múltiplo de 7");
        }else if (a%11 == 0){
            System.out.println("O número é múltiplo de 11");
        }else{
            System.out.println("O número não é múltiplo de 7 e 11");
        }
    }
}
