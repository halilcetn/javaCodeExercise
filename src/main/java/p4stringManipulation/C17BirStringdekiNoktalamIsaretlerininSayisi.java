package p4stringManipulation;

public class C17BirStringdekiNoktalamIsaretlerininSayisi {
    public static void main(String[] args) {

        //17) B!r Str!ng’ de kullanılan noktalama !saretler!n!n sayısını bulmak !ç!n b!r kod yazınız.

        /*
        String s = "Vay be! Ali 13 yasında ama üniversite ögrencisi.";
        int noktalamIsaretlerininSayisi = s.replaceAll("[^{Punct}]","").length();
        System.out.println(noktalamIsaretlerininSayisi);
         */

        String s = "Vay be! Ali 13 yasında ama üniversite ögrencisi.";
        int toplamKrkSayisi = s.length();
        int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();
        int noktalamaIsaretlerininSayisi= toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi;
        System.out.println(noktalamaIsaretlerininSayisi);
    }
}
