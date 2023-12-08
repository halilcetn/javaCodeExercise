package p7ifStatements;

public class C01Mevsimler {
    public static void main(String[] args) {
        /*
            1) Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
            a) Aralık, Ocak, Subat !ç!n "Kıs"
            b) Mart, N!san, Mayıs !ç!n "Ilkbahar"
            c) Haz!ran, Temmuz, Agustos !ç!n "Yaz"
            d) Eylül, Ek!m, Kasım !ç!n "Sonbahar"
            e) D!gerler! !ç!n "Geçers!z ay adı"

         */
            String ayAdi = " Aralik";
            ayAdi = ayAdi.toLowerCase();
            if(ayAdi.equals("aralik ") || ayAdi.equals("ocak") || ayAdi.equals("subat")){
            System.out.println("Kis");
            }else if(ayAdi.equals("mart") || ayAdi.equals("nisan") || ayAdi.equals("mayis")){
            System.out.println("Ilkbahar ");
            }else if(ayAdi.equals("haziran") || ayAdi.equals("temmuz") || ayAdi.equals("agustos")){
            System.out.println("Yaz ");
            }else if(ayAdi.equals("eylul") || ayAdi.equals("ekim") || ayAdi.equals("kasim")){
            System.out.println("Sonbahar ");
            }else{
            System.out.println("Gecersiz ay adi ");
            }


            /*
            2) Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
            a) S!fre bosluk karakter!nden farklı en az 8 karakter !çer!yorsa "Geçerl! S!fre"
            b) Herhang! b!r poz!syonda s!frede bosluk karakter! varsa "S!frede bosluk karakter! kullanmayınız"
            c) a ve b kosullarının saglanmaması durumunda "Geçers!z S!fre"
            Not: Çözümdeki kosulların sıralarına dikkat ediniz.
           */

        String sifre = "a1b2c3d4";
        if(sifre.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if(sifre.replaceAll("\\s", "").length()>=8){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre ");
        }

    }
}
