package day09ifstatements;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int sayi = girdi.nextInt();
        if (sayi % 2 ==0){
            System.out.println("Girilen sayı çift sayıdır");
        }else {
            System.out.println("Girilen sayı tek sayıdır");
        }





    }
}
