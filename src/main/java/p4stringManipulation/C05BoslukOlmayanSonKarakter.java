package p4stringManipulation;

public class C05BoslukOlmayanSonKarakter {
    public static void main(String[] args) {
        /*
        5) Bir String degiskeni olusturunuz ve String degiskenin konsolda bosluk olmayan son
        karakteri yazdırınız.
        Örnek: 'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.
         */
        String name = " Ali Can   ";
        String s = name.trim();
        System.out.println(s.charAt(s.length()-1));

        /*
        String s = "Miami ";
        int boslukOlmayanSonKrkIndex= s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(boslukOlmayanSonKrkIndex,
        boslukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);
         */

    }
}
