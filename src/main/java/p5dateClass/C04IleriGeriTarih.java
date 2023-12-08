package p5dateClass;

import java.time.LocalDate;

public class C04IleriGeriTarih {
    public static void main(String[] args) {

        /*
        Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra dogmustur.
        Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce dogmustur.
        Ali ve Veli'nin kesin dogum tarihini hesaplamak için kodu yazınız.
        Ali ve Veli'nin dogum tarihinin aynı olup olmadıgını kontrol etmek için kodu yazınız.
         */

        LocalDate dogumGunuTarihiAli =
                LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dogumGunuTarihiVeli =
                LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("Tarihler ayni mi ? : " + dogumGunuTarihiAli.equals(dogumGunuTarihiVeli));

    }
}
