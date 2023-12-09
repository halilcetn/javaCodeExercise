package p7ifStatements;

public class C09VucutKitleIndeksi {
    public static void main(String[] args) {
        /*
        10) Ver!len BMI degerler! !ç!n Vücut K!tle Indeks! (BMI) !le !lg!l! mesajları yazdırmak !ç!n kod
        yazınız.
        Geçers!z BMI deger! < 0
        Zayıf = <18.5
        Normal agırlık = 18.5–24.9
        Fazla k!lolu = 25–29.9
        Obez!te = 30 veya daha büyük BMI
         */

        double bmi = 12;
        if(bmi<0){
            System.out.println("Gecersiz BMI degeri");
        }else if(bmi<18.5){
            System.out.println("Zayif ");
        }else if(bmi<24.9 && bmi>=18.5){
            System.out.println("Normal agirlik ");
        }else if(bmi<29.9 && bmi>=25){
            System.out.println("Fazla kilolu");
        }else if(bmi>30){
            System.out.println("Obezite");
        }

    }
}
