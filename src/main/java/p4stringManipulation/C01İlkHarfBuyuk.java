package p4stringManipulation;

import java.util.Scanner;

public class C01İlkHarfBuyuk {
    public static void main(String[] args) {
            /*
            1) Sadece tek bir kelimeden olusan sehir isimleri için bir String degiskeni olusturun. Sehir
               ismini, bas harfi büyük ve diger tüm karakterleri küçük harfler olacak sekilde konsolda
               yazdırınız.
               Örnek: mIAMI - Miami
               miami - Miami
               MIAMI - Miami
               mIaMi - Miami vb.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String cityName = input.next();
        String cityNameFirstCharUpper = cityName.toUpperCase().charAt(0)+cityName.substring(1);
        System.out.println(cityNameFirstCharUpper);
    }
}
