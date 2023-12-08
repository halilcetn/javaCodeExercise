package p4stringManipulation;

public class C14BelirliBirKarakterKontrolu {
    public static void main(String[] args) {

        /*
        14) Bir String’ in belirli bir tek karaktere sahip olup olmadıgını üç farklı sekilde kontrol etmek
        için kod yazınız.
         */

        String sifre = "1234Halil";

        boolean enAzBirBuyukHarfVarMi = sifre.replaceAll("[^A-Z]","").length()>0;

        System.out.println("enAzBirBuyukHarfVarMi = " + enAzBirBuyukHarfVarMi);

        /*
        1. Yol:
        String s = "Java";
        Boolean sonuc = s.contains("v");
        System.out.println("karakteri iceriyor mu? " + sonuc);
        2. Yol:
        String s = "Java";
        Boolean sonuc = s.replaceAll("[^v]", "").length()>0;
        System.out.println("karakteri iceriyor mu? " + sonuc);
        3. Yol:
        String s = "Java";
        Boolean sonuc = s.indexOf("v")!=-1;
        System.out.println("karakteri iceriyor mu? " + sonuc);
         */


    }
}
