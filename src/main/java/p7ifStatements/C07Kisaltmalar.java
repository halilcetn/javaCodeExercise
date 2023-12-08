package p7ifStatements;

public class C07Kisaltmalar {
    public static void main(String[] args) {

    /*
    8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla
        olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları asagıdak
        ilerden farklı karakterler içeremez" yazmalıdır.
        Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        küçük harf içeremez", ve "Eyalet kısaltmaları asagıdakilerden farklı karakterler içeremez"
        yazmalıdır.
     */

        String eyaletKisaltma = "Fl3";
        if(eyaletKisaltma.length()>2){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }
        if(eyaletKisaltma.replaceAll("[^a-z]","").length()!=0){
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }
        if(eyaletKisaltma.replaceAll("[^A-Za-z]","").length()!=0){
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");
        }


    }
}
