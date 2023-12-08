package p7ifStatements;

import java.util.Scanner;

public class C06DilBilgisi {
    public static void main(String[] args) {
        /*
        7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
            a) Kodunuz "ali Can", "Ali can", "ali can" için "Bas harflerinde hata" yazmalıdır.
            b) Kodunuz, asagıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
            c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
            d) Kodunuz bir veya daha fazla bosluk (" " veya " " gibi karakterler) için " Isim girilmedi"
            yazmalıdır.
            e) Ad, harfler ve bosluktan baska herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
            yazmalıdır.
            Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
            görünmelidir. Örnegin; "ali3" için kodunuz "Bas harflerinde hata", "Ad veya soyadı eksik" ve
            "Geçersiz Ad"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adınızı ve soyadınızı giriniz");
        String isim = scan.nextLine();
        String adinIlkHarfi = isim.substring(0,1);
        int boslukIndex = isim.trim().indexOf(' ');
        String soyadinIlkHarfi = isim.substring(boslukIndex+1,boslukIndex+2);
        boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');

        boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');

        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }
        if(isim.equals(isim.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi ");
        }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }
        
    }
}
