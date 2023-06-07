package day11nestedifternaryincrementdecrement;

public class TekrarTernary02 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int r1 = b < a ? a++ : ++b;
        System.out.println(r1);//21
        System.out.println(a);//10
        System.out.println(b);//21

        //Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        int x = -4;
        int sonuc= x<0 ? -1*x : x;
        System.out.println(sonuc);
        //Ornek 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // " farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int e = -6;
        int f = -6;
        Object sonuc2 = e>0 && f>0 || e<0 && f<00 ? e*f : "Farklı işaretler çarpamam :(";
        System.out.println(sonuc2);

        //Ornek 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int say= 34;
        Object sonuc3=say>99 && say<1000 ? "üç basamaklı" : "üç basamaklı değil";
        System.out.println(sonuc3);



    }
}
