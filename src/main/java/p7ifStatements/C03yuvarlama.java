package p7ifStatements;

public class C03yuvarlama {
    public static void main(String[] args) {
        /*
        4) Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e es!t ve 5 den büyükse, yuvarlama !slem!: “Son basamagı b!r üst ondalıga
        yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama !slem!: “Son basamagı b!r alt ondalıga yuvarla”
         */

        int i = 124;
        if(i%10>=5){
            System.out.println("Son basamagı bir üst ondalıga yuvarla :"+ (i/10+1)*10);
        }else{
            System.out.println("Son basamagı bir alt ondalıga yuvarla :"+ (i/10)*10);
        }

    }
}
