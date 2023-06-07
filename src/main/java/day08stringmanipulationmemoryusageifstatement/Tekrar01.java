package day08stringmanipulationmemoryusageifstatement;

public class Tekrar01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum
        String s ="     ";
        boolean s1 = s.length()==0;
        System.out.println("Sitring boş mu?  "+s1);

        //2.yol
        boolean s2 = s.isEmpty();
        System.out.println("is Empty? " +s2);
        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        boolean s3 = s.replace(" ","").length()==0;
        System.out.println(s3);
        //2.yol
        boolean s4 = s.replace(" ","").isEmpty();
        System.out.println(s4);

        //3.yol
        boolean s5 = s.isBlank();
        System.out.println(s5);

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index
        String r ="Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);
        int idxI = r.indexOf('i');
        System.out.println(idxI);
       int idxE = r.indexOf('e');
        System.out.println(idxE);
        int totalIndex = idxA+idxI+idxE;
        System.out.println(totalIndex);
        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis
        // olursunuz
        String t = "Ah Java vah Java sensiz olmuyor Java.";
        int t1 = t.indexOf("Java");
        System.out.println(t1);
        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          0123456789
        String v = "Java is easy to learn";
        int v1 = v.lastIndexOf('a');
        System.out.println(v1);
        int v2 = v.lastIndexOf('i');
        System.out.println(v2);
        int v3 =v.lastIndexOf('e');
        System.out.println(v3);
        System.out.println(v1+v2+v3);







    }
}
