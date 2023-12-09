package p8ternaryStatements;

import java.util.Scanner;

public class C07TekCift {
    public static void main(String[] args) {
        //9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num = scan.nextInt();

        String cntrl = num%2 == 0 ? "Cift" : "Tek";

        System.out.println(cntrl);
    }
}
