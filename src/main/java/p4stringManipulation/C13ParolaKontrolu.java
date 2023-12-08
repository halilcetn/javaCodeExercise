package p4stringManipulation;

import java.util.Scanner;

public class C13ParolaKontrolu {
    public static void main(String[] args) {
        
        /*
        13) Asagıdaki kosullar için bir parolanın geçerli olup olmadıgını kontrol etmek için kod yazınız;
        Sifre bosluk karakterinden farklı olacak sekilde en az 8 karakter içermelidir. Sifrede en az 1
        sembol olmalıdır.
        Örnek: 'A2bi' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        'i1a23b4' için kodunuz konsolda false yazdırmalıdır.
        'i1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        'i a b 3 k' kodunuz konsolda false yazdırmalıdır.
         */

        int kontrol = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bosluk icermeyen,az 1 sembol iceren ve en az 8 karakterlik bir sifre belirleyiniz");
            String sifre = scan.next();

            boolean sekizKaraktermi = sifre.length() > 7;
            boolean enAzBirSembolVarMi = sifre.replaceAll("[a-zA-Z0-9]", "").length() > 0;

            if (sekizKaraktermi && enAzBirSembolVarMi) {
                System.out.println("SİFRE GECERLİ");
                kontrol=1;
            } else {
                System.out.println("SİFRE GECERSİZ TEKRAR DENEYİNİZ");
            }
        } while (kontrol!=1);
    }
}
