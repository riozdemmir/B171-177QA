package day21arraylists;

import java.util.List;

public class Tekrar03 {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Character> initials= List.of('a','b','d','c','d');
        System.out.println(initials.indexOf('c'));
        System.out.println(initials.indexOf('a'));
        System.out.println(initials.lastIndexOf('d'));


    }
}
