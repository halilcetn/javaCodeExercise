package p7ifStatements;

import java.util.Scanner;

public class C04UcgenCesidi {
    public static void main(String[] args) {
        /*
        5) Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
            a) B!r üçgen!n !k! kenarının uzunlugu es!tse "Ik!zkenar Üçgen".
            b) B!r üçgen!n tüm kenarlarının uzunlugu es!tse "Eskenar Üçgen".
            c) a ve b kosulları saglanmıyorsa "Çes!t Kenar Üçgen"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ücgeninizin birinci kenar uzunlugunu giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen ücgeninizin ikiinci kenar uzunlugunu giriniz");
        int b = scan.nextInt();
        System.out.println("Lutfen ücgeninizin üçüncü kenar uzunlugunu giriniz");
        int c = scan.nextInt();

        if (a==b && b==c ){
            System.out.println("Eşkenar Üçgen");
        } else if (a==b || b==c || a==c ) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşit kenar üçgen");
        }
    }
}
