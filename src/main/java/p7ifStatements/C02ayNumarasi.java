package p7ifStatements;

public class C02ayNumarasi {
    public static void main(String[] args) {
        /*3) Ayın numarasını g!rd!g!n!zde ayın adını yazdırmak !ç!n gereken kodu yazınız.
                Örnek; 1 !ç!n çıktı: "Ocak", 2 !ç!n çıktı: "Subat" vb.
         */

        int ayNo = 3;
        if(ayNo ==1){
            System.out.println("Ocak");
        }else if(ayNo ==2){
            System.out.println("Subat");
        }else if(ayNo ==3){
            System.out.println("Mart");
        }else if(ayNo ==4){
            System.out.println("Nisan");
        }else if(ayNo ==5){
            System.out.println("Mayis");
        }else if(ayNo ==6){
            System.out.println("Haziran");
        }else if(ayNo ==7){
            System.out.println("Temmuz");
        }else if(ayNo ==8){
            System.out.println("Agustos");
        }else if(ayNo ==9){
            System.out.println("Eylul");
        }else if(ayNo ==10){
            System.out.println("Ekim");
        }else if(ayNo ==11){
            System.out.println("Kasim");
        }else if(ayNo ==12){
            System.out.println("Aralik");
        }else{
            System.out.println("Gecersiz ay numarasi");
        }
    }
}
