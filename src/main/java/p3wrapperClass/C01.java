package p3wrapperClass;

public class C01 {
    public static void main(String[] args) {

        //1) Byte data tipinin minimum degeri ile short data tipinin maksimum degerinin toplamını
        //bulmak için bir kod yazınız.

        Byte byteMin = Byte.MIN_VALUE;
        Short shortMax = Short.MAX_VALUE;
        System.out.println("byteMin + shortMax = " + (byteMin+shortMax));

        //2) Data tipi String olan “103” degerini byte data tipine dönüstürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” degerini short data tipine dönüstürüp konsolda iki
        //degisken arasındaki farkı yazdırınız.

        String str = "103";
        byte sb = Byte.valueOf(str);




        //3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?

        /*
        valueOf(String s) metodu, bir stringi ilgili veri tipine dönüştürmek için genellikle bir sınıfın içindeki static bir metottur.
         Örneğin, Integer.valueOf(String s) bir stringi bir Integer nesnesine dönüştürür.

        parseByte(String s) metodu ise, yalnızca bir stringi byte veri tipine dönüştürmek için kullanılır.
         Bu metot da bir sınıfın içinde bulunabilir, örneğin Byte.parseByte(String s).

        Farkları şu şekilde özetleyebiliriz:

        valueOf(String s) genellikle bir sınıfın içinde static olarak bulunur ve genellikle ilgili veri tipinin nesnesini döndürür.
        parseByte(String s) ise yalnızca stringi byte veri tipine dönüştürür ve genellikle byte veri tipinin sınıfında bulunur.
        Bununla birlikte, valueOf genellikle daha geniş bir kullanıma sahiptir çünkü farklı veri tiplerini dönüştürmek için çeşitli
        sınıflarda bulunabilir. Ancak parseByte sadece stringleri byte veri tipine dönüştürmek için kullanılır.
         */

    }
}
