package p4stringManipulation;

public class C09ilkVeSonKarakterlerHaric {
    public static void main(String[] args) {
        
        /*
        9) Bir String degiskeni olusturunuz ve konsolda ilk karakter ve son karakter dısındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */

        String s = "Yarın";
        String s2 = s.substring(1,s.length()-1).toUpperCase();
        System.out.println(s2);

        /*
        String s = "Java";
        Integer sonKrkIndex = s.length()-1;
        String ilkSonKrkDisindakiler = s.substring(1, sonKrkIndex).toUpperCase();
        System.out.println("ilk ve son karakter disindaki tum karakterler buyuk harf ile : " +
        ilkSonKrkDisindakiler);
         */
        
    }
}
