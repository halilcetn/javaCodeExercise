package p2typeCasting;

public class C01typeCasting {
    public static void main(String[] args) {

        //1Short data tipinde bir degisken olusturunuz ve onu bir int degiskenine dönüstürünüz.
        short x = 121;
        int y = x;  //Auto Widening


        //2Long data tipinde bir degisken olusturunuz ve onu bir int degiskenine dönüstürünüz.
        long z = 5656;
        int w =(int) z;  //Explicit Narrowing


        //3Double data tipinde bir degisken olusturunuz ve onu bir float degiskenine dönüstürünüz.
        double d = 565.6958;
        float f = (float) d; //Explicit Narrowing

        //4 Double data tipinde bir degisken olusturunuz ve onu bir short degiskenine dönüstürünüz.
        //Sonrasında bu short degiskenin degerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        double db = 56.89;
        short s = (short) db;
        System.out.println("short s"+s);

        //5 Byte data tipinde bir degisken olusturunuz ve onu bir double degiskenine dönüstürünüz.
        //Sonrasında bu double degiskenin degerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        byte age = 23;
        double newAge = age;
        System.out.println("double newAge "+newAge);

    }
}
