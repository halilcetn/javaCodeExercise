package p6date_TimeClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C01KisiselZaman {
    public static void main(String[] args) {
        /*
        1) Eger saat
        !) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
        !!) 08:00 ile 16:00 arasında ise konsola 'Çalısma zamanı' yazdırınız.
        !!!) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
        iv) Digerleri için konsolda 'Kisisel zaman' yazdırınız.
         */

        LocalTime now = LocalTime.now();

        int saat = now.getHour();

        if (saat > 0 && saat < 5) {
            System.out.println("Uyku zamanı");
        } else if (saat > 8 && saat < 16) {
            System.out.println("Calısma Zamanı");
        } else if (saat > 19 && saat < 22) {
            System.out.println("Aile Zamanı");
        } else {
            System.out.println("Kisisel Zaman");
        }


    }
}
