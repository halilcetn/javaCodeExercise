package p4stringManipulation;

public class C03AlfabetikVeNumericKarakterlerinSayisi {
    public static void main(String[] args) {
        /*
        Bir String degiskeni olusturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */

        String str = " Miami 33018!!! ";
        String s = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s.length());

        /*
        String s = " Miami 33018!!! ";
        Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Toplam alfabetik ve sayısal karakter sayisi:" + karakterSayisi);
         */
    }
}
