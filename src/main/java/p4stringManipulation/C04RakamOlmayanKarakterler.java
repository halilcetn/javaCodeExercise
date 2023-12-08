package p4stringManipulation;

public class C04RakamOlmayanKarakterler {
    public static void main(String[] args) {
        /*
        B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
        konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         */

        String s = "2a3B4?-!5";
        String s1 = s.replaceAll("[0-9]","");
        System.out.println(s1.length());
        /*
        String s = "2a3B4?-!5";
        Integer rakamOlmayanKrkSayisi = s.replaceAll("[0-9]","").length();
        System.out.println("rakam olmayan toplam karakter sayisi: " + rakamOlmayanKrkSayisi);
         */
    }
}
