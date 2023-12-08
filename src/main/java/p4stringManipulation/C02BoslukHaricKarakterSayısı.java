package p4stringManipulation;

public class C02BoslukHaricKarakterSayısı {
    public static void main(String[] args) {
        
        /*
        Kisi isimleri için 3 String degisken olusturunuz. Bosluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
         */
        String isim1 = "Ali Can";
        String isim2 ="Merve Star";
        String isim3= "Mark Tom";

        String toplamKarakterler = isim1.replaceAll(" ","")+isim2.replaceAll(" ","")+isim3.replaceAll(" ","");
        System.out.println(toplamKarakterler.length());

        /*
        String isim1 = "Ali Can";
        String isim2 = "Aliye Canan";
        String isim3 = "Aliyev Can Cananov";
        Integer c1 = isim1.replaceAll("\\s","").length();
        Integer c2 = isim2.replaceAll("\\s","").length();
        Integer c3 = isim3.replaceAll("\\s","").length();
        System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi: " + (c1 + c2 + c3));
         */

    }
}
