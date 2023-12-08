package p4stringManipulation;

public class C08SonKarakterHaric {
    public static void main(String[] args) {
        
        /*
        8) Bir String degiskeni olusturunuz ve son karakteri dısındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */

        String s = "Yarın";
        String s2 = s.substring(0,s.length()-1).toUpperCase();
        System.out.println(s2);

        /*
        String s = "Java";
        Integer sonKrkIndex = s.length()-1;
        String sonKrkDisindakiler = s.substring(0, indexOfLastChar).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);
         */

    }
}
