package day07stringmanipulations;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
            /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Password giriniz");
        String pswrd = input.nextLine();
        boolean first = pswrd.length()>7;
        System.out.println("first = " + first);

        boolean second = !pswrd.contains(" ");
        System.out.println("second = " + second);

        boolean third = pswrd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);

        boolean fourth = pswrd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        boolean fifth = pswrd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println("Password geçerli mi ? "+(first && second && third && fourth && fifth));


    }
}
