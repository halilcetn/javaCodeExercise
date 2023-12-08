package p4stringManipulation;

import java.util.Scanner;

public class C16AdSoyadBasHarfleri {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String nameSurname ="";

        String nameSurname2 = "";

        int sayac =1;
        do {
            System.out.println("Lutfen adınızı ve soyadınızı aralarında bir bosluk olacak sekilde giriniz");
            input.nextLine();
            int trimlenmis = nameSurname.trim().length();
            int bosluksuz = nameSurname.replaceAll("\\s", "").length();

            if (trimlenmis-bosluksuz==1) {
                nameSurname2 = nameSurname;
                sayac =0;
            } else {
                System.out.println("Lutfen adınızı ve soyadınızı aralarında bir bosluk olacak sekilde kontrol ederek tekrar giriniz");
                nameSurname = input.nextLine();
            }
        } while (sayac!=0);

          char isminIlkHarfi = nameSurname2.charAt(0);

          char soyIsminIlkHarfi = nameSurname2.split(" ")[1].charAt(0);

        System.out.println("adın ve soayadın ilk harfleri " +isminIlkHarfi+soyIsminIlkHarfi);
    }
}
