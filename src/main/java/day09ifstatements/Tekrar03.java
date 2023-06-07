package day09ifstatements;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {

        //Ornek : Kullanıcının vermiş olduğu karakter buyuk harf ise ekrana
        // "Buyuk harf" kucuk ise ekrana "kucuk harf" yazdır
        Scanner girdi =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = girdi.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println("Girilen karakter büyük harftir.");
        }else if (ch>='a'&& ch<='z'){
            System.out.println("Girilen karakter küçük harftir.");
        }else {
            System.out.println("Girilen karakter harf değildir.");
        }

    }
}
