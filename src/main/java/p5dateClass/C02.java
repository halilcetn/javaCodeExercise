package p5dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan tarihleri al
        System.out.println("Başlangıç tarihini girin (yyyy-MM-dd): ");
        String startDateString = scanner.nextLine();

        System.out.println("Bitiş tarihini girin (yyyy-MM-dd): ");
        String endDateString = scanner.nextLine();

        try {
            // Tarihleri Date nesnelerine çevir
            Date startDate = parseDate(startDateString);
            Date endDate = parseDate(endDateString);

            // Metodu çağır ve sonucu yazdır
            int daysBetween = daysBetweenDates(startDate, endDate);
            System.out.println("Tarihler arasındaki gün sayısı: " + daysBetween);
        } catch (ParseException e) {
            System.out.println("Geçersiz tarih formatı. Lütfen yyyy-MM-dd formatında girin.");
        }
    }

    // Belirtilen tarihler arasındaki gün sayısını hesaplayan metot
    public static int daysBetweenDates(Date startDate, Date endDate) {
        long difference = endDate.getTime() - startDate.getTime();
        int daysBetween = (int) (difference / (1000 * 60 * 60 * 24));
        return daysBetween;
    }

    // Tarih stringini Date nesnesine çeviren metot
    public static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(dateString);
        return date;


    }
}
