package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Kullanıcının vermiş olduğu karakter buyuk harf ise ekrana
        // "Buyuk harf" kucuk ise ekrana "kucuk harf" yazdır
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz..");
        char ch =girdi.next().charAt(0);

/*
            1.yoll
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Küçük harf");
        }
 */
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");

        }else if (ch>='a' && ch<='z'){

            System.out.println("Küçük harf ");
        }else {
            System.out.println("Harf değil");
        }



    }
}
