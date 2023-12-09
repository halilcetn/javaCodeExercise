package p7ifStatements;

import java.util.Scanner;

public class C08HesapMakinesi {
    public static void main(String[] args) {
        /*
        9) Herhang! b!r 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan bas!t b!r hesap mak!nes!
        olusturmak !ç!n kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İslem yapmak icin ilk sayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("İslem yapmak icin ikinci sayiyi giriniz");
        int b = scan.nextInt();
        System.out.println("Yapmak istediginiz islemin isaretini giriniz + , - , * , / ");

        String operator = scan.next();

        if(operator.equals("+")){
            System.out.println(a+b);
        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);
        }
    }
}
