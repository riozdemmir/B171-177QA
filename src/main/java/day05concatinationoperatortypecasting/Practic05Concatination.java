package day05concatinationoperatortypecasting;

public class Practic05Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable oluşturun String değeri ile int lerin toplamını consola yazdırın.
        String b = "armut";

        int c = 12;
        int d = 12;
        System.out.println(b+(c+d));
        System.out.println(c*d+b);
        System.out.println(c+b+d);

        //Ornek 2: Size String olarak verilen 2 fiyatın toplamını ekrana yazdırınız
        String fiyatArmut ="1500";
        String fiyatElma = "200";
        System.out.println("Toplam Fiyat= "+fiyatElma+fiyatArmut);
        int toplamFiyat = Integer.valueOf(fiyatArmut)+ Integer.valueOf(fiyatElma);
        System.out.println("toplamFiyat = " + toplamFiyat);



    }
}
