package p5dateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class C03YasHesap {
    public static void main(String[] args) {
    /*
        Ali'nin kaç gün yasadıgını bulan kodu yazınız.
        Ali'nin dogum tarihi 12 Mayıs 2002'dir.
     */
        // Ali'nin doğum tarihi
        LocalDate dogumTarihi = LocalDate.of(2002, 5, 12);

        // Bugünün tarihi olarak şu anın tarihini alıyoruz
        LocalDate bugun = LocalDate.now();

        // Doğum tarihinden bugüne kadar geçen gün sayısı
        long gunSayisi = ChronoUnit.DAYS.between(dogumTarihi, bugun);

        System.out.println("Ali'nin bugüne kadar yaşadığı gün sayısı: " + gunSayisi);


        /*
        Ali'nin kaç ay yasadıgını bulan kodu yazınız.
        Ali'nin dogum tarihi 4 Haziran 1997'dir.
         */

        // Ali'nin doğum tarihi
        LocalDate dogmtrh = LocalDate.of(1997, 6, 4);

        // Bugünün tarihi olarak şu anın tarihini alıyoruz
        LocalDate bgn = LocalDate.now();

        // Doğum tarihinden bugüne kadar geçen ay sayısı
        int aySayisi = (int) ChronoUnit.MONTHS.between(dogmtrh, bgn);

        System.out.println("Ali'nin bugüne kadar yaşadığı ay sayısı: " + aySayisi);



        /*
        Ali'nin dogum tarihi 4 Haziran 1997'dir. Ali'nin dogum tarihinden 2 yıl, 3 ay ve 12 gün
        sonraki tam tarihi bulmak için kodu yazınız.
         */
        LocalDate ilrkTrh = dogmtrh.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("Ali'nin dogum tarihinden 2 yıl 3 ay 12 gun sonraki tarih = " + ilrkTrh);

    }
}
