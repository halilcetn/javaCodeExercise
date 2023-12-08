package p4stringManipulation;

import java.util.Scanner;

public class C11BasindaSonundaBoslukVarMi {
    public static void main(String[] args) {
        
        /*
        11) Bir String’ in basında ve sonunda bosluk karakteri olup olmadıgını kontrol etmek için kod
        yazınız.
        Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ad Soyad Giriniz");
        String nameSurname = input.nextLine();

        String trimlenmis = nameSurname.trim();

        boolean basindaVeyaSonundaBoslukVarMi = nameSurname.equals(trimlenmis);
        System.out.println("basindaSonundaBoslukVarMi = " + !basindaVeyaSonundaBoslukVarMi);

        /*
        String s = " Tom ";
        String trimlenmis = s.trim();
        Boolean sonuc = s.equals(trimlenmis);
        System.out.println("basinda ve sonunda bosluk var mi : " + !sonuc);
         */
    }
}
