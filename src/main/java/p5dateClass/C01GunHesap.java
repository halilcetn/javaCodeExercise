package p5dateClass;

import java.util.Scanner;

public class C01GunHesap {

    public static void main(String[] args) {


            /*
        Belirtilen tarihler arasında kaç gün olduğunu veren "daysBetweenDates" metodu oluşturunuz.
        Metodunuz belirtilen tarihler arasındaki gün sayısını integer değer olarak döndürecek
         */

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tarihleri al
        System.out.println("Başlangıç tarihini girin (yyyy-MM-dd): ");
        String startDateString = scanner.nextLine();

        System.out.println("Bitiş tarihini girin (yyyy-MM-dd): ");
        String endDateString = scanner.nextLine();

        // Tarihleri kontrol et ve gün sayısını hesapla
        int daysBetween = daysBetweenDates(startDateString, endDateString);

        if (daysBetween >= 0) {
            System.out.println("Tarihler arasındaki gün sayısı: " + daysBetween);
        } else {
            System.out.println("Geçersiz tarih formatı. Lütfen yyyy-MM-dd formatında girin.");
        }
    }

    // Belirtilen tarihler arasındaki gün sayısını hesaplayan metot
    public static int daysBetweenDates(String startDateString, String endDateString) {
        int daysBetween = -1; // Başlangıç değeri geçersiz bir durumu temsil eder

        try {
            // Tarihleri kontrol et
            if (startDateString.matches("\\d{4}-\\d{2}-\\d{2}") && endDateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
                // Tarihleri çözümle ve gün sayısını hesapla
                long startDate = parseDate(startDateString);
                long endDate = parseDate(endDateString);
                daysBetween = (int) ((endDate - startDate) / (24 * 60 * 60 * 1000));
            }
        } catch (NumberFormatException e) {
            // Geçersiz tarih formatı
            daysBetween = -1;
            System.out.println("");
        }

        return daysBetween;
    }

    // Tarih stringini long cinsine çeviren metot
    public static long parseDate(String dateString) throws NumberFormatException {
        String[] dateParts = dateString.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        return (year - 1970) * 365 + month * 30 + day;
    }
}
