package p8ternaryStatements;

public class C06NestedSifreKontrolu {
    public static void main(String[] args) {
        /*
        5) Nested Ternary kullanarak;
        Sifreyi kontrol eden kodu yazınız.
        8'den fazla karakter içeriyorsa, bas harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, bas harfi 'K' olmalıdır.
         */
        
        String pwd = "6546sdsdasd";
        String cntrl = pwd.length()>8 ? pwd.startsWith("i") ? "Gecerli" : "Gecersiz" : pwd.startsWith("K") ? "Gecerli" : "Gecersiz";

        System.out.println(cntrl);
    }
}
