package p8ternaryStatements;

import java.util.Scanner;

public class C03FarkliIsaretliSayilarinCarpimi {
    public static void main(String[] args) {
        //Ornek 3: Iki sayinin isareti ayni ise bu sayilari carpan,isaretleri farkli ise
        // “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        //Sayilari kullanıcıdan alalım.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2 = scan.nextInt();

        Object result = (num1*num2>0) ? (num1*num2) : ("Farkli isaretli sayilari carpamiyorum");

        System.out.println(result);
    }
}
