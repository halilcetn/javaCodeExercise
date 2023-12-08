package p4stringManipulation;

import java.util.Scanner;

public class C10BoslukKontrolu {
    public static void main(String[] args) {
        /*
        10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir bosluk karakteri olup
        olmadıgını kontrol etmek için kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘Ali Can’ için konsolda true yazmalıdır.
         */

        int sayac =1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen adınızı ve soyadınızı aralarında bir bosluk olacak sekilde giriniz");
            String nameSurname = input.nextLine();

            int trimlenmis = nameSurname.trim().length();
            int bosluksuz = nameSurname.replaceAll("\\s", "").length();

            String nameSurname2 = "";
            if (trimlenmis-bosluksuz==1) {
                nameSurname2 = nameSurname;
                sayac=0;
            } else {
                System.out.println("Lutfen adınızı ve soyadınızı aralarında bir bosluk olacak sekilde kontrol ederek tekrar giriniz");
                nameSurname = input.nextLine();
            }
        } while (sayac!=0);

        /*
        String s = "Tom Hanks";
        String trimlenmis = s.trim();
        String hicBoslukYok = trimlenmis.replaceAll("\\s", "");
        Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;
         System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);
         */


    }
}
