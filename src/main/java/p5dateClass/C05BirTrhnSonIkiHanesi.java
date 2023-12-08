package p5dateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class C05BirTrhnSonIkiHanesi {
    public static void main(String[] args) {
        //Belirtilen bir tarihten yılın son iki hanesini alın

        LocalDate trh = LocalDate.of(2023, 11, 15);

        int yilinSonIkiHanesi = trh.getYear() % 100;
        System.out.println("yilinSonIkiHanesi = " + yilinSonIkiHanesi);

        /*
        Bel!rl! b!r yılın "Artık yıl" olup olmadıgını kontrol etmek !ç!n kodu yazınız.
        Artık Yıl:
        i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örnegin; 2000 artık yıl, 1900
        degildir.
        ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örnegin; 2004 artık yıl, 2007
        degildir.
         */

        LocalDate leapYear = LocalDate.of(1965, 6, 16);

        System.out.println("leapYear.isLeapYear() = " + leapYear.isLeapYear());

        //İki farklı tarihin ay sayıları toplamı

        LocalDate trh1 = LocalDate.of(1990, 4, 8);
        LocalDate trh2 = LocalDate.of(1994, 5, 8);

        System.out.println("ayların toplami = " + (trh1.getMonthValue() + trh2.getMonthValue()));
        System.out.println(trh1.getMonth());
        System.out.println(trh2.getMonth());


        //Ik! farklı tar!h !ç!n saat farkını bulunuz.

        LocalDate date1 = LocalDate.of(1990, 4, 8);
        LocalDate date2 = LocalDate.of(1994, 5, 8);

        long saatFarki = ChronoUnit.HOURS.between(date1, date2);
        System.out.println("saatFarki = " + saatFarki);

    }
}
