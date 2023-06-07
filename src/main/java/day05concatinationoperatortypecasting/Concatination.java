package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir String ve iki int variable oluşturun String değeri ile int lerin toplamını consola yazdırın.
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b); //elma1011
        System.out.println(s + (a + b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayı rasında kullanılırsa "toplama işlemi" olur.
        //Java da "+" sembolu iki String arasında veya bir String ve bir sayı arasında kullanılırsa "concatination" işlemi olur.
        //concatination işlemi birleştirme yapar.
        //Note : Cancatination işlemlerinde java matematikteki işlem önceliği kurallarını kullanır.
        /*
        1) Once uslü sayilar
        2) Parantez içi işlemler yapılır.
        3) Çarpma ve bölme işlemleri yapılır.
        4) Toplama ve çıkarma işlemleri yapılır.
        5)Aynı öncelikli olanlarda soldan sağa başlanır.
         */

        //Ornek 2: Size String olarak verilen 2 fiyatın toplamını ekrana yazdırınız
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);// 23005200
        // Integer.valueOf() sitring değerleri integer a çevirir.
        int toplamFiyat = Integer.valueOf(shirt) +Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size String olarak verilen 2 fiyatın toplamını ekrana yazdırınız.
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
        // Note : valueOf() methodu tüm karakterleri rakam olan Stringleri sayılara çevirir.
        // Eğer valueOf() methodu kullanılırken Stringin içine rakam olmayan karakter koyarsanız hata alırsınız.
        // Bu tarz hataları düzeltmeyi ileride öğreneceğiz.
        // valueOf() methodu kullanılırken sadece rakam olan karakterler kullanılmalıdır.







    }
}
