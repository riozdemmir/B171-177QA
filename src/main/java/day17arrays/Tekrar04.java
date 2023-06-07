package day17arrays;

import java.util.Arrays;

public class Tekrar04 {
    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String harf []=s.replaceAll("[^A-Za-z]","").split("");
        System.out.println(Arrays.toString(harf));
        System.out.println(harf.length+" tane harf vardır");



    }//Main

}
