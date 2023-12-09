package p8ternaryStatements;

import java.util.Scanner;

public class C02MutlakDeger {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //Not: Bir sayinin 0'a uzakligi mutlak degerdir. mesala -4 un sifira uzakligi 4'dur.
        //     -4'u -1 ile carparsak mutlak degeri yani sifira uzakligini buluruz.

        //Sayıyı kullanıcıdan alalım
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mutlak değerini öğrenmek istediğiniz bir tamsayi giriniz");
        int sayi = input.nextInt();

        sayi = (sayi<0) ? (-1*sayi) : (sayi) ;

        System.out.println(sayi);
    }
}
