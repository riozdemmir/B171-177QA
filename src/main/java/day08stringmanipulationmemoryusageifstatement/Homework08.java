package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
       // 1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

        String s = "Turkiye'de 7 bölge vardir";
        int s1 = s.replaceAll("[0-9]","").length();
        System.out.println("Rakamlar hariç : "+s1);

        //    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki
        //    tum karakterleri console a buyuk harflerle yazdiriniz

        String m = "Manisa Güzeldir";
        String m1= m.substring(1,m.length()-1).toUpperCase();
        System.out.println("İlk ve son karakterler hariç  " +m1);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri
        // toplamini console a yazdiriniz

        String k = "Ridvan Ozdemir";
        System.out.println(k);
        char ılk = k.charAt(0);
        char son = k.charAt(k.length()-1);
        System.out.println("ASCII değer toplam: "+(ılk+son));
        //    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle
        //    diger harflerini kucuk harflerle console a yazdirin
        String i = "istanbul";
        System.out.println(i);
        char cty1= i.toUpperCase().charAt(0);
        String cty2 = i.substring(1).toLowerCase();
        System.out.println(cty1+cty2);

        //2.yol
       String city3 = i.substring(0,1).toUpperCase();
       String city4 =i.substring(1).toLowerCase();
        System.out.println( city3+city4);

        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
         */
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen parolanızı giriniz");
        String parola = girdi.nextLine();
        boolean first = parola.length()>5;
        boolean second = parola.replaceAll("[^A-Z]","").length()>0;
        boolean third = parola.replaceAll("[^a-z]","").length()>0;
        boolean fourth = parola.replaceAll("[^0-9]","").length()>0;
        System.out.println("Parola geçerli mi? "+(first&&second&&third&&fourth));



    }

}
