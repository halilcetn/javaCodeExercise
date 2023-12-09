package p8ternaryStatements;

import java.util.Scanner;

public class C05ArtikYil {
    public static void main(String[] args) {

        /*
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Artık yıl olup olmadıgini kontrol etmek istediginiz yili giriniz");
        int year = input.nextInt();

        Object result = (year%100==0) ?((year%400==0) ? ("Leap year"): ("Not Leap year")): ((year%4==0)? ("Leap year"):("Not leap year"));

        System.out.println(result);
    }
}
