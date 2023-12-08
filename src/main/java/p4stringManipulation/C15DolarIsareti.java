package p4stringManipulation;

import java.util.Map;

public class C15DolarIsareti {
    public static void main(String[] args) {
        
        /*
        15) String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
         */

        String montFiyati = "$55.50";
        String ayakkabiFiyati = "$39.99";

        String m = montFiyati.replaceAll("[$]","");
        String a = ayakkabiFiyati.replaceAll("[$]","");

        double mFiyat = Double.valueOf(m);
        double aFiyat = Double.valueOf(a);

        double toplam = mFiyat+aFiyat;

        System.out.println("toplam = " + toplam/100);
    }
}
