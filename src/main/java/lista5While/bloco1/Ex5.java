package lista5While.bloco1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n, limite;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número limite: ");
        limite = scan.nextInt();
        n = 0;
        while (n<=limite){
            if(n%5==0){
                System.out.println(n);
            }
            else{}
            n++;
        }
        scan.close();
        System.exit(0);
    }
}
