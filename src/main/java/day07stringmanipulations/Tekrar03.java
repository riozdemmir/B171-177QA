package day07stringmanipulations;

public class Tekrar03 {
    public static void main(String[] args) {
        //Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        //  "    Ridvan Ozdemir    " ==> "Ridvan Ozdemir"

        String r ="    Ridvan Ozdemir    ";
        System.out.println(r);
        String rTrim = r.trim();
        System.out.println(rTrim);

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //  String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String lapTop = "$875.99";
        String tv1 = tv.replaceAll("[$]","");
        System.out.println(tv1);
        String lapTop1 = lapTop.replaceAll("[$]","");
        System.out.println(lapTop1);

        double totalPrice = Double.valueOf(tv1)+ Double.valueOf(lapTop1);
        System.out.println(totalPrice);

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "    Ridvan Ozdemir   "
        String s = " ridvan oZDemIR ";
        System.out.println(s);
        char char1 = s.trim().toUpperCase().charAt(0);
        System.out.println(char1);

        char char2 = s.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(char2);
        System.out.println(""+char1+char2);








    }
}
