package listaRevisao;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade. ");
        a = sc.nextInt();

        if (a>=5 && a<=7){
            System.out.println("Categoria Infantil");
        } else if (a>=8 && a<=17) {
            System.out.println("Categoria Juvenil");
        } else if (a>=18) {
            System.out.println("Categoria Senior");
        } else {
            System.out.println("Não se enquadra em nenhuma categoria");
        }
        sc.close();
    }
}
