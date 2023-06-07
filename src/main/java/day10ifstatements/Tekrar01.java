package day10ifstatements;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        //Ornek: Verilen bir sayinin pozitif, negatif yada notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int sayi = input.nextInt();
        if (sayi>0){
            System.out.println("Pozitif");
        }else if (sayi<0){
            System.out.println("Negatif");
        }else {
            System.out.println("Nötr");
        }




    }
}
