package p4stringManipulation;

public class C06KarakterlerinAsciiDegeri {
    public static void main(String[] args) {
        
    
     /*
     Bir String degiskeni olusturunuz ve String'in ilk ve son karakterlerinin ASCII degerlerinin
    toplamını bulunuz.
      */
        
        String s = "Adana Ceyhan ";

        String s1 = s.trim();
        int ilkKarakterAscii = s1.charAt(0);
        int sonKarakterAscii = s1.charAt(s1.length()-1);
        System.out.println("ilk ve son karakterlerin ascii degerleri toplamı = " +( ilkKarakterAscii+sonKarakterAscii));

        /*
        String s = "Miami";
        int sonKrkIndex = s.length()-1;
        int ilkKrkAscii= s.charAt(0);
        int sonKrkAscii = s.charAt(sonKrkIndex);
        System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " + (ilkKrkAscii +
        sonKrkAscii));
         */

    }    
}
