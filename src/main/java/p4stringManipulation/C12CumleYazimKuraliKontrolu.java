package p4stringManipulation;

import java.util.Scanner;

public class C12CumleYazimKuraliKontrolu {
    public static void main(String[] args) {
        /*
        12) B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
        yazınız.
        Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
        ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kuralli bir cümle yazınız");
        String cumle = input.nextLine();

        char cumleninIlkHarfi = cumle.charAt(0);
        char cumleninSonKarakteri = cumle.charAt(cumle.length()-1);

        boolean ilkKarakterKontrolu = cumleninIlkHarfi>='A' && cumleninIlkHarfi<='Z';
        boolean noktaIleMiBitmis = cumleninSonKarakteri=='.';
        boolean cumleKuralliMi = ilkKarakterKontrolu && noktaIleMiBitmis;

        System.out.println("cumleKuralliMi = " + cumleKuralliMi);
    }
}
