package p9switch_OnStatements;

import java.util.Scanner;

public class C01Mevsimler {

    /*
    1) Yazdırmak !ç!n sw!tch !fades!n! kullanınız.
        a) Aralık, Ocak, Subat !ç!n "Kıs"
        b) Mart, N!san, Mayıs !ç!n "Bahar"
        c) Haz!ran, Temmuz, Agustos !ç!n "Yaz"
        d) Eylül, Ek!m, Kasım !ç!n "Güz"
        e) D!gerler! !ç!n "Geçers!z ay adı"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay adı giriniz");
        String ayAdi = scan.next();

        ayAdi = ayAdi.toLowerCase();

        switch(ayAdi){
            case "aralık":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasım":
                System.out.println("Guz");
                break;
            default:
                System.out.println("Gecersiz ay adi");
                break;
        }
    }
}
