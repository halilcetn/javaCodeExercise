package p8ternaryStatements;

import java.util.Scanner;

public class C04SayiUcBasamakliMi {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int number = input.nextInt();

        System.out.println( (number>99 && number<1000) ? ("Girdiginiz sayi 3 basamakli") : ("Girdiginiz sayi 3 basamakli degil"));
    }
}
