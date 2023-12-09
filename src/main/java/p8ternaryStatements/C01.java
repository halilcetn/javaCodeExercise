package p8ternaryStatements;

public class C01 {
    public static void main(String[] args) {

    /*
    1) Ternary kullanarak, asagıdak! kodları konsolda yazdırınız.
    Parola bosluk karakter!nden farklı olarak en az 8 karakter !çer!yorsa, "Geçerl! Parola",
    Parola bosluk karakter!nden farklı olarak 8 karakterden daha az !se, "Geçers!z Parola"
     */

        String parola = "a1b 2c3";
        String gecerliMi = parola.replaceAll("\\s","").length()>7 ? "Gecerli Parola" : "Gecersiz Parola";
        System.out.println(gecerliMi);


    }
}
